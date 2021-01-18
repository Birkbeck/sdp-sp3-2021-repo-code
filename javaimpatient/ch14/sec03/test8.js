// Run as jjs --language=es6 < ch14/sec03/test8.js

var square = function(x) { return x * x}
   // The right-hand side is an anonymous function
var result = square(2) 
   // The () operator invokes the function
result

var words = Java.to('Mary had a little lamb'.split(' '), Java.type('java.lang.String[]'))
java.util.Arrays.sort(words, function(s, t) { return s.length - t.length })
java.util.Arrays.toString(words)

java.util.Arrays.sort(words, (s, t) => s.length - a.length)
java.util.Arrays.toString(words)