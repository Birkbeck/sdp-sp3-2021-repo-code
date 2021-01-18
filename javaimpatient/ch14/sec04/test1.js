// Run as jjs -scripting ch14/sec04/test1.js
// (on Linux/Unix/Mac OS X only)

var output = `ls -al`

print(output)

var output2 = $EXEC('grep -v java', `ls -al`)

print(output2)