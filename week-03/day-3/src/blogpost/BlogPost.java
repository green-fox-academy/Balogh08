package blogpost;

import java.util.Date;

public class BlogPost {

    String authorname;
    String title;
    String text;
    String publicationDate;

    public BlogPost(){

    }

    public BlogPost(String authorname, String title, String text,String publicationDate){
        this.authorname = authorname;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void printPlogPost(){
        System.out.println("Authorname: " + authorname + "\nTitle: " + title + "\nText: " + text + "\nPpublication Date: " + publicationDate + "\n");
    }
}
