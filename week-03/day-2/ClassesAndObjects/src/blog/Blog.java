package blog;

import blogpost.BlogPost;
import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> listOfBlogPost;

  public Blog() {
    listOfBlogPost = new ArrayList<>();
  }

  public void add(BlogPost blogpost) {
    listOfBlogPost.add(blogpost);
  }

  public boolean delete(int index) {
    if (index >= 0 && index < listOfBlogPost.size()) {
      listOfBlogPost.remove(index);
      return true;
    }
    return false;
  }

  public void update(int index, BlogPost blogPost) {
    if (delete(index)) {
      listOfBlogPost.add(index, blogPost);
    }
  }

  public void printBlog() {
    for (int i = 0; i < listOfBlogPost.size(); i++) {
      listOfBlogPost.get(i).printBlogPost();
    }
  }
}
