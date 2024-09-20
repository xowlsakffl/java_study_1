package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        float a = 15.5f;
        float b = 20.5f;

        floatAdd(a, b);//call by value 방식
        System.out.println("종료");
    }

    public static void floatAdd(float a, float b) {
        float result = a + b;
        System.out.println(result);
    }
}
