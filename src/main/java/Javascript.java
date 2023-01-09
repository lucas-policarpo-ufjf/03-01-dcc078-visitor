public class Javascript implements ProgrammingLanguage {
  private String print;
  private String fileExtension;

  public Javascript(String print, String fileExtension) {
    this.print = print;
    this.fileExtension = fileExtension;
  }

  public String accept(Visitor visitor) {
    return visitor.printJavascript(this);
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
