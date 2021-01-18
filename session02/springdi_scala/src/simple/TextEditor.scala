class TextEditor {
  private var spellChecker: SpellChecker = null

  def getSpellChecker: SpellChecker = {
    spellChecker
  }

  def setSpellChecker(spellChecker: SpellChecker) {
    println("Inside setSpellChecker.")
    this.spellChecker = spellChecker
  }

  def spellCheck {
    println("Doing spell check")
    spellChecker.checkSpelling
  }
}