package charsequence;

public class Gnirts implements CharSequence {
    String name;

    public Gnirts (String name) {
        this.name = name;
    }

    @Override
    public char charAt(int index) {
        return name.charAt(name.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String result = "";
        start = name.length() - start - 1;
        end = name.length() - end - 1;
        for (int i = start; i > end; i--) {
            result += name.charAt(i);
        }
        return result;
    }

    @Override
    public int length() {
        return name.length();
    }

}
