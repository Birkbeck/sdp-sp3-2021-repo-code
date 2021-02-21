## Java Streams

+ processed as a pipeline
+ for bulk data processing
+ Each "pipeline" consists of:
    + a single stream generator (data source)
    + zero or more intermediate steps (stream operations)
    + a single terminal stream operation
+ Provides a (mostly) functional data processing model
+ Enables "painless" parallelism
    + Simply replace `stream` with `parallelStream`
    + You may or may not see a performance improvement    