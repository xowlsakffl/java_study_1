package fc.java.part2;

public class ForLoopTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //대문자와 아스키코드값 출력
        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c+":"+(int)c);
        }

        int[] nums = {1,2,3,4,5,6,7,8,9};
        for(int su: nums){
            System.out.println(su);
        }
    }
}
