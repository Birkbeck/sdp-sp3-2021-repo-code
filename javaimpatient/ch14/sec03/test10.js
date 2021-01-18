// Run as jjs ch14/sec03/test10.js
// (without redirection)

list = new java.util.ArrayList()
try {
   var first = list.get(0)
   print(first)
} catch (e) {
   if (e instanceof java.lang.IndexOutOfBoundsException)
      print('list is empty')     
}