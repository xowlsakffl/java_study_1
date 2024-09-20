package fc.java.part2;

public class WhileTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int i = 0;
        while (i<a.length){
            System.out.println(a[i]);
            i++;
        }

        i = 11;
        do {
            System.out.println(i);
            i++;
        }while (i<a.length);
    }
}
