package blogpost;

public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public void blogPostPrinter() {
    System.out.println(authorName + "\n" + title + "\n" + text + "\n" + publicationDate + "\n");
  }
}