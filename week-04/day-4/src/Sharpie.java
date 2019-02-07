public class Sharpie {
    String color;
    double width;
    double inkAmount;

    public Sharpie(String color, double width){
        this.color = color;
        this.width = width;
        inkAmount = 100;
    }

    public double use(){
        if (inkAmount == 0) {
            return inkAmount = 0;
        }
        return inkAmount--;
    }

}
