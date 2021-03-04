package app;

import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("Waiting for the bug to be fixed so these tests can run")
//@TestMethodOrder(MethodOrderer.MethodName.class)
class AppTest {

  @BeforeAll
  static void setupOnce() {
    System.out.println("Before...");
  }

  @AfterAll
  static void hadEnough() {
    System.out.println("After all...");
  }

  static IntStream rangeProvider() {
    return IntStream.range(0, 10);
  }

  static int divide(int x, int y) {
    return x / y;
  }

  @BeforeEach
  void setUp() {
    System.out.println("Before Each");
  }

  @Tag("Dev")
  @EnabledOnOs({OS.MAC, OS.LINUX})
  @EnabledOnJre({JRE.JAVA_15})
  @Test
  void testCalculation() {
    Assumptions.assumeTrue(3 == 3);
    Assumptions.assumingThat(3 == 3, () -> System.out.println("It is true!"));
    System.out.println("Test Calculation");
    Assertions.assertEquals(4, 2 + 2);
  }

  @Tag("Prod")
  @Order(1)
  @DisplayName("This is the other calculation test")
  @Test
  void testOtherCalcultion() {
    System.out.println("Test Other Calculation");
  }

  @Disabled("Ignore until I've finished writing the feeder class")
  @Test
  void testNothing() {
    System.out.println("Test should be disabled");
  }

  @RepeatedTest(3)
  void anotherTest() {
    System.out.println("Yes...");
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 4})
  void testInts(int arg) {
    assertTrue(arg > 0);
    System.out.println("Okay with " + arg);
  }

  @ParameterizedTest
  @MethodSource("rangeProvider")
  void testStreamSource(int arg) {
    assertTrue(arg < 10);
    System.out.println("Arg in MethodSource is " + arg);
  }

  @Test
  void testException() {
    Exception exception = assertThrows(
      ArithmeticException.class,
      () -> divide(1, 0));

    assertTrue(exception.getMessage().contains("zero"));
  }

  @Test
  //@Timeout(2)
  void doSomethingExpensive() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
  }

  @AfterEach
  void tearDown() {
    System.out.println("After Each");
  }
}