package fc.java.part2;

public class LogicalOperTest {
    public static void main(String[] args) {
        int x = 1, y = 0;
        System.out.println(!(x>0));
        System.out.println(x>0 && x<3);
        System.out.println(x>0 && y<0);
        System.out.println(x<0 || y>=0);
        System.out.println(y<0 && y<-5);
    }
}
