package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char c='A';
        System.out.println("c = " + c);
        
        int a='A';
        System.out.println("a = " + a);

        int b='A'+32;
        System.out.println("b = " + (char)b);

        //
        char d='가';
        System.out.println("d = " + (int)d);

        int e='\uAC00';
        System.out.println("e = " + (char)e);

        char upper = 'A';
        char lower = (char)(upper+32);
        System.out.println("lower = " + lower);

        char lower1 = 'e';
        int upper1 = lower1-32;
        System.out.println("upper1 = " + (char)upper1);

        //'1'+'2'=3
        int data = '1'+'2';
        System.out.println("data = " + data);
        
        int x = '1';
        int y = '2';
        int sum = (x-48) + (y-48);//(x-'0') + (y-'0');
        System.out.println("sum = " + sum);

        // '1'+'2'+'3'+'4'+'5'=15
        int sum1 = 0;
        sum1 += ('1'-'0');
        sum1 += ('2'-'0');
        sum1 += ('3'-'0');
        sum1 += ('4'-'0');
        sum1 += ('5'-'0');
        System.out.println("sum1 = " + sum1);
    }
}
