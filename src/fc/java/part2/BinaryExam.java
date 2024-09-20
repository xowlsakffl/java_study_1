package fc.java.part2;

public class BinaryExam {
    public static void main(String[] args) {
        int a = 200;
        String b = Integer.toBinaryString(a);
        System.out.println("b = " + b);

        String c = Integer.toOctalString(a);
        System.out.println("c = " + c);

        String d = Integer.toHexString(a);
        System.out.println("d = " + d);

        int x = 0b11001000;
        System.out.println("x = " + x);
        int y = 0310;
        System.out.println("y = " + y);
        int z = 0xac00;
        System.out.println("z = " + z);

    }
}
