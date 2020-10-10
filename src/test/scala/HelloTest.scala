import org.junit._ ;

class HelloTest {

  @Test def `Hello should start with H`: Unit = {
    assert("Hello".startsWith("H"))
  }

}