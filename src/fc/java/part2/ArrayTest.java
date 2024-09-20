package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        float[] a = {10.1f, 11.2f, 12, 13, 14, 15};
        float[] b = new float[5];
        float[] c = new float[]{1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.6f};
        float[] d;
        d = new float[]{10.1f, 11.2f, 12, 13, 14, 15};

        int[] e = {10,20,30,40,50,60,70,80,90,100};
        int f = e[3]+e[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println(e[i]);
        }
        System.out.println(f);

        char[] g = {'A','P','P','L','E'};
        for (int i = 0; i < g.length; i++) {
            System.out.print((char)(g[i]+32));
        }
    }
}
