# Java Streams

+ These are not the I/O Streams api
+ Bulk data processing  
  Process a bunch of objects, from some collection
+ Processing pipeline  
  ```
  generator => intermediate processing steps => terminator
  ```  
  + A single *stream generator*
  + Zero or more *intermediate stream processing operations*
  + A single *terminal stream operation*
+ Until you invoke (call) the terminator the stream does nothing.


