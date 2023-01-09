public class VisitorProgrammingLanguage implements Visitor {
  public String print(ProgrammingLanguage language) {
    return language.accept(this);
  }

  public String printJavascript(Javascript js) {
    return "Javascript: " + js.getPrint() + "." + js.getFileExtension();
  }

  public String printPython(Python py) {
    return "Python: " + py.getPrint() + "." + py.getFileExtension();
  }

  public String printRust(Rust ru) {
    return "Rust: " + ru.getPrint() + "." + ru.getFileExtension();
  }

}
