package postit;

public class TaskPostIt {
    public static void main(String[] args) {
        PostIt firstText = new PostIt();
        firstText.backgroundColor = "orange";
        firstText.textcolor = "blue";
        firstText.text = "Idea 1";

        PostIt secondText = new PostIt();
        secondText.backgroundColor = "pink";
        secondText.textcolor = "black";
        secondText.text = "Awesome";

        PostIt thirdText = new PostIt();
        thirdText.backgroundColor = "yellow";
        thirdText.textcolor= "green";
        thirdText.text = "Superb!";
    }
}
