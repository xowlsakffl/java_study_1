package fc.java.part2;

public class CastingTest {
    public static void main(String[] args) {
        int a = 15;
        System.out.println("(double)a = " + (double)a);
        
        double b = 15.345234234;
        System.out.println("(int)b = " + (int)b);

        float c = .10f;
        System.out.println("c = " + c);

        float d = 15f;
        System.out.println("(float)d = " + (float)d);

        float e = 3.14f;
        System.out.println("e = " + e);

        double f = 123.4567891;
        System.out.println("f = " + f);

        float g = 123.3f;
        int h = (int)g;//강제형변환
        System.out.println("h = " + h);

        char i = 'A';
        int j = i;//자동형변화
        System.out.println("j = " + j);
        
        int k = 50;
        double l = k;
        System.out.println("l = " + l);

        double num = 5.123;
        int num1 = (int)num;
        System.out.println("num1 = " + num1);
    }
}
