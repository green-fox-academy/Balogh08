import java.util.ArrayList;

public class Candyshop {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        arrayList.add("Brownie");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }

        public static Object sweets(ArrayList usedArrayList) {

            Object toBeReplacedValue1 = 2;
            Object toBeReplacedValue2 = false;

            for (int i = 0; i < usedArrayList.size(); i++) {
                if (usedArrayList.get(i) == toBeReplacedValue1) {
                    usedArrayList.set(usedArrayList.indexOf(usedArrayList.get(i)), "Croissant");
                } else if (usedArrayList.get(i) == toBeReplacedValue2) {
                    usedArrayList.set(usedArrayList.indexOf(usedArrayList.get(i)), "Ice cream");
                }
            }
            return usedArrayList;
        }


    }