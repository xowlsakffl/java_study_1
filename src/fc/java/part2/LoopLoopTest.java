package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"단\t\t");
            int[] b = {1,2,3,4,5,6,7,8,9};
            for (int j = 0; j < a.length; j++) {
                int aw = a[i] * b[j];
                System.out.print(a[i]+"x"+b[j]+"="+aw+"\t");
            }
            System.out.println();
        }

        int[][] c = {
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
        };
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
