package fc.java.part2;

import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = (a<b)?a:b;
        System.out.println("min = " + min);

        int max = (a>b)?a:b;
        System.out.println("max = " + max);
    }
}
