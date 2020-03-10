import java.lang.StringBuilder;

public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url=url.replace("bots","odds");
        url=url.replace("//","://");
        System.out.println(url);

        url = "https//www.reddit.com/r/nevertellmethebots";
        url=url.replace("bots","");
        url=url.concat("odds");
        StringBuilder builder=new StringBuilder();
        builder.append(url);
        builder.insert(5,':');
        url=builder.toString();
        System.out.println(url);
        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
    }
}