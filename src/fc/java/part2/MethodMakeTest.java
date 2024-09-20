package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int sum = add(a, b);
        System.out.println(sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
