import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

object MainApp {
  def main(args: Array[String]) {
    val context: ApplicationContext = new ClassPathXmlApplicationContext("Beans.xml")
    val te: TextEditor = context.getBean("textEditor").asInstanceOf[TextEditor]
    te.spellCheck
  }
}