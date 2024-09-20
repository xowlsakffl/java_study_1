package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = hap(a, b);// StaticTest. 이 생략되어있다. 다른 클래스라면 StaticTest.hap(a,b)로 사용
        System.out.println(sum);

        StaticTest st = new StaticTest();
        int sum1 = st.hap1(a, b);
        System.out.println(sum1);
    }

    public static int hap(int a, int b){ // static zone 메모리 공간에 할당됨
        int v = a + b;
        return v;
    }

    public int hap1(int a, int b){ // heap area 에 있는 객체가 none static zone 메모리 공간을 가르킴
        int v = a + b;
        return v;
    }
}
