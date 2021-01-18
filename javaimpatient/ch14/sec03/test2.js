// Run as jjs < ch14/sec03/test2.js

var fmt = java.text.NumberFormat.getPercentInstance()
var rate = 0.0725
fmt.format(rate)
// fmt.setMinimumFractionDigits(2)
fmt.minimumFractionDigits = 2
// fmt['minimumFractionDigits'] = 2
fmt.format(rate)

var list = new java.util.ArrayList
list.add('Peter')
list.add('Paul')
list.add('Mary')
list.add(1)
list
list.remove(1)
list
list['remove(Object)'](1)
list