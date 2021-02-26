# Unit testing with JUnit 5

```
JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage
```

+ JUnit Platform - launches tests, build tools, plugins, platform API
    + Defines `TestEngine`
    + Has a console launcher for command line invocation
+ JUnit Jupiter - new extensions to the JUnit model that were (mainly) previewed in latter 
versions of JUnit 4.
+ JUnit Vintage - support for running JUnit 3 and JUnit 4 tests on the JUnit 5 platform.

```java
@BeforeEach
@AfterEach
@BeforeAll
@AfterAll
@Test
@DisplayName
@Disable
@Nested
@Tag
@TestFactory
```