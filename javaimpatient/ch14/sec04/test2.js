// Run as jjs -scripting ch14/sec04/test2.js
// (on Linux/Unix/Mac OS X only)

classpath=`pwd`
mainclass='Hello'
`rm ${mainclass.class}`
var cmd = "javac -classpath ${classpath} ${mainclass}.java"
print(cmd)
var output = $EXEC(cmd)
print(output)
var message = "The current time is ${java.time.Instant.now()}"
print(message)
message = 'The current time is ${java.time.Instant.now()}'
print(message)

name='myapp'
dir='/opt/apps/myapp'
// Using cat instead of asadmin
output = $EXEC("cat", <<END)
start-domain
start-database
deploy ${name} ${dir}
exit
END
print(output)