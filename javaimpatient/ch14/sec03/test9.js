// Run as jjs ch14/sec03/test9.js 
// (without redirection)

var RandomIterator = Java.extend(java.util.Iterator, {
   next: function() Math.random(),
   hasNext: function() true
}) // RandomIterator is a class object
var iter = new RandomIterator() // Use it to construct an instance
print(iter.next())
print(iter.next())
print(iter.next())

var task = new java.lang.Runnable(function() { print('Hello') })
task.run()

iter = new java.util.Iterator {
   count: 10,
   next: function() { this.count--; return Math.random() },
   hasNext: function() this.count > 0 
}

while (iter.hasNext()) print(iter.next())

var arr = new (Java.extend(java.util.ArrayList)) {
   add: function(x) {
      print('Adding ' + x);
      return Java.super(arr).add(x)
   }
}

arr.add('Fred')
print(arr)