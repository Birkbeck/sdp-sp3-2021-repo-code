// Run as jjs < ch14/sec03/test5.js

'Hello'.slice(-2.99)
var price = 9.95
java.lang.String.format('Price: %.2f', price)
price = 10
java.lang.String.format('Price: %.2f', price)
   // Error: f format not valid for java.lang.Integer
java.lang.String.format('Price: %.2f', Number(price))