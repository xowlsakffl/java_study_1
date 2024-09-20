package fc.java.part2;

public class OverLoadingTest {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int sum = add(a, b);
        System.out.println(sum);

        float c = 14.1f;
        float d = 14.1f;
        float sum1 = add(c, d);
        System.out.println(sum1);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static float add(float a, float b){
        return a+b;
    }
}
