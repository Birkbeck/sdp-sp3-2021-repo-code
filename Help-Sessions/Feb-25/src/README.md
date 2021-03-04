# Java Streams API+ 

+ **Not** the Java IO Streams api
+ Pipeline API
+ Bulk processing
+ Pipeline
    + A single *stream generator* (**data source**)
    + Zero or more *intermediate stream operations*
    + A single *terminal stream operation*
+ Useful in immutable, functional programming, data processing scenario
+ Parallelism
    + replace `stream` with `parallelStream`
    + Not always a performance improvement
  
```
stream generator => intermediate => intermediate => terminal
```

+ Until we execute the *terminal* step nothing happens
