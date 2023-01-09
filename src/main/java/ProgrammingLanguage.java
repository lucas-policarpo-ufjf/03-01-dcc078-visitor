public interface ProgrammingLanguage {
  String getFileExtension();

  String getPrint();

  String accept(Visitor visitor);
}
