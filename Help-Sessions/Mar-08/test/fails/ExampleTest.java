package fails;

import org.junit.jupiter.api.*;

import java.lang.reflect.Field;

import static java.lang.Class.forName;
import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
  Class cl = null;
  Field[] fields = null;

  @BeforeAll
  void setUp() {
    try {
      cl = Class.forName("fails.Example");
      fields = cl.getFields();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  @AfterAll
  void tearDown() {
    cl = null;
  }

  @Test
  void ohNo() {
  }

  @Test
  void returnsAnInt() {
  }
}