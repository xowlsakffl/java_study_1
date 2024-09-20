package fc.java.part2;

import java.util.Scanner;

public class IfBasicClass {
    public static void main(String[] args) {
        int x = 10;
        if (x > 0){
            System.out.println("양수입니다.");
        }
        System.out.println("종료");

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y >= 0){
            System.out.println("양수입니다");
        }else{
            System.out.println("음수입니다");
        }

        if (y % 7 == 0){
            System.out.println("7의배수");
        }

        int age = sc.nextInt();
        if (age >= 19){
            System.out.println("성인입니다");
        }
    }
}
