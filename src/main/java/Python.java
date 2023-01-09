public class Python implements ProgrammingLanguage {
  private String print;
  private String fileExtension;

  public Python(String print, String fileExtension) {
    this.print = print;
    this.fileExtension = fileExtension;
  }

  public String accept(Visitor visitor) {
    return visitor.printPython(this);
  }

  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public String getPrint() {
    return print;
  }

  public void setPrint(String print) {
    this.print = print;
  }

}
