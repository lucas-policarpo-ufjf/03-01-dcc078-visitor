import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorProgrammingLanguageTest {

  @Test
  void shouldPrintJavascript() {
    Javascript js = new Javascript("console.log()", "js");
    VisitorProgrammingLanguage visitor = new VisitorProgrammingLanguage();
    assertEquals("Javascript: console.log().js", visitor.print(js));
  }

  @Test
  void shouldPrintPython() {
    Python py = new Python("print()", "py");
    VisitorProgrammingLanguage visitor = new VisitorProgrammingLanguage();
    assertEquals("Python: print().py", visitor.print(py));
  }

  @Test
  void shouldPrintRust() {
    Rust js = new Rust("println()", "rs");
    VisitorProgrammingLanguage visitor = new VisitorProgrammingLanguage();
    assertEquals("Rust: println().rs", visitor.print(js));
  }

}
