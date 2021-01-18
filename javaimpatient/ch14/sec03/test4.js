// Run as jjs < ch14/sec03/test4.js

'Hello'.slice(-2) // Yields 'lo'
'Hello'.compareTo('World')
var files = new java.util.HashSet()
var filename = "config"
var extension = ".properties"
files.add(filename + extension)
if (!files.contains("config.properties")) print('Yikes!')
files.add(String(filename + extension))
if (files.contains("config.properties")) print('Yeah!')
var path = java.nio.file.Paths.get(/home/)
   // A JavaScript RegExp is converted to a Java String!
path
'Hello'.slice('-2')