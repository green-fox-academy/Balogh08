package sharpie;

public class Sharpie {
    String color;
    double width;
    double inkAmount = 100;

    public Sharpie(){

    }

    public Sharpie(String color, double width){
        this.color = color;
        this.width = width;
    }

    public void use(){
        inkAmount--;
    }

}
