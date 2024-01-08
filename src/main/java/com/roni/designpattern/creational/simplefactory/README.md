### What problem simple factory solves?
- Multiple types can be instantiated and the choice is based on some simple criteria
```java 
/**
 * Abstract post class. Represents a generic post on a web site. 
 */
public abstract class Post {
    private Long id;
    private String title;
    private String content;
}

public class BlogPost extends Post {
    private String author;
    private String[] tags;
}

public class ProductPost extends Post{
    private String imageUrl;
    private String name;
}

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 */
public class PostFactory {
    public static Post createPost(String type) {
        switch(type) {
            case "blog":
                return new BlogPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }

}
```
```java
public class Client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post);
    }
}
```

### What is Simple Factory?

- Here we simply move the instantiation logic to a separate class and most commonly to a static method of this class
- Some do don consider simple factory to be a "design pattern", as it's simply a method that encapsulates object instantiation. Nothing complex goes on in that case


### Implementation Considerations
- Simple factory can be just a method in existing class.
- Simple factory itself doesn't need any state tracking so it's best to keep this as a static method