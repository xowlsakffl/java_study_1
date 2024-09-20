package fc.java.part2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int a = sc.nextInt();//블럭상태
        System.out.println("a = " + a);

        System.out.println("실수를 입력하세요.");
        float b = sc.nextFloat();
        System.out.println("b = " + b);

        System.out.println("문자열을 입력하세요.");
        String c = sc.next();
        System.out.println("c = " + c);

        sc.nextLine();//버퍼 비우기(스트림 비우기)

        System.out.println("문자열을 입력하세요.");
        String d = sc.nextLine();
        System.out.println("d = " + d);

        sc.close();
    }
}
