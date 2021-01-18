// Run as jjs < ch14/sec03/test2.js

var javaNetPackage = java.net // A JavaPackage object
var URL = java.net.URL // A JavaClass object
var JMath = Java.type('java.lang.Math') // Avoids conflict with JavaScript Math object
JMath.floorMod(-3, 10)

var Url = java.net.Url // Typo
Url // Nonexistent package
Url = Java.type('java.net.Url') // Typo causes error

var url = new URL('http://horstmann.com')
url = new java.net.URL('http://horstmann.com')
url = new (Java.type('java.net.URL'))('http://horstmann.com')

var entry = new java.util.AbstractMap.SimpleEntry('hello', 42)
entry
var Entry = Java.type('java.util.AbstractMap$SimpleEntry')
new Entry('hello', 42)