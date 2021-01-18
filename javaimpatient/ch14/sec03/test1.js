// Run as jjs < ch14/sec03/test1.js

'Hello, World'
'Hello, World'.length
function factorial(n) { return n <= 1 ? 1 : n * factorial(n - 1) }
factorial(10)
var url = new java.net.URL('http://horstmann.com')
var input = new java.util.Scanner(url.openStream())
input.useDelimiter('$')
var contents = input.next()
contents