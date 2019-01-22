public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");
        url = url.replace("s/","s:/");

        System.out.println(url);
    }
}
