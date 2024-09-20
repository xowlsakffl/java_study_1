package fc.java.part2;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        //자릿수 구하기
        int digit = 3625;
        System.out.println(digit % 10);//일의 자리수
        System.out.println(digit / 10 % 10);//십의 자리수
        System.out.println(digit / 100 % 10);//백의 자리수
        System.out.println(digit / 1000 % 10);//천의 자리수
        
    }
}
