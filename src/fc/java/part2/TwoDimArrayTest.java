package fc.java.part2;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        int[][] a = new int[2][4];

        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[0][3] = 4;
        a[1][0] = 1;
        a[1][1] = 2;
        a[1][2] = 3;
        a[1][3] = 4;

        //System.out.println(a[0][0]+"\t"+a[0][1]+"\t"+a[0][2]+"\t"+a[0][3]);
        //System.out.println(a[1][0]+"\t"+a[1][1]+"\t"+a[1][2]+"\t"+a[1][3]);

        //System.out.println(b[0][0]+"\t"+b[0][1]+"\t"+b[0][2]+"\t"+b[0][3]);
        //System.out.println(b[1][0]+"\t"+b[1][1]+"\t"+b[1][2]+"\t"+b[1][3]);

        int[][] b = {{1,2,3,4}, {4,5,6,8}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

        int[][] c = new int[5][];
        c[0] = new int[1];
        c[1] = new int[2];
        c[2] = new int[3];
        c[3] = new int[4];
        c[4] = new int[5];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = '★';
                System.out.print((char)c[i][j]+"\t");
            }
            System.out.println();
        }

        int[][] d = new int[3][];
        d[0] = new int[]{1};
        d[1] = new int[]{1,2};
        d[2] = new int[]{1,2,3};

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
