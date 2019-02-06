package charsequence;

public class Shifter implements CharSequence {
    String word;
    int shiftBy;

    public Shifter(String word, int shiftBy) {
        this.word = word;
        this.shiftBy = shiftBy;
    }


    @Override
    public int length() {
        return word.length()+shiftBy;
    }

    @Override
    public char charAt(int index) {
        try {
            return word.charAt(index + shiftBy);
        } catch ( StringIndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.toString());
            return 0;
        }
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        try{
            String result = "";
            start += shiftBy;
            end += shiftBy;
            for (int i = start; i < end ; i++) {
                result += word.charAt(i);
            }
            return result;
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.toString());
            return "***End value may be to high***";
        }
    }
}
