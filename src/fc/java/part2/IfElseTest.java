package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 80){
            if(score >= 90){
                System.out.println("A반");
            }else if(score >= 85){
                System.out.println("B반");
            }else{
                System.out.println("C반");
            }
        }else{
            System.out.println("불합격");
        }
    }
}
