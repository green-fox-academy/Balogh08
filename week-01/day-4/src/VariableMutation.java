public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 8;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f3 = f1 > f2;
        if (f3) {
            System.out.println(f3);
        }
        else System.out.println(false);

        int g1 = 350;
        int g2 = 200;
        boolean g3 = 2 * g2 > g1;
        if (g3){
            System.out.println(g3);
        }
        else System.out.println(false);

        int h = 125798745;
        boolean h2 = h % 11 == 0;
        if (h2){
            System.out.println(h2);
        }
        else System.out.println(false);

        int i1 = 10;
        int i2 = 3;
        boolean i3 = i1 > i2*i2 && i1 < i2*i2*i2;
        if (i3){
            System.out.println(i3);
        }
        else System.out.println(false);

        int j = 1521;
        boolean j2 = j % 3 == 0 || j % 5 == 0;
        if (j2){
            System.out.println(j2);
        }
        else System.out.println(false);

        String k = "Apple";
        k = k + k + k + k;
        System.out.println(k);

    }
}
