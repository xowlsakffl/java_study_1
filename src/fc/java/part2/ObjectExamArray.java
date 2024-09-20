package fc.java.part2;

public class ObjectExamArray {
    public static void main(String[] args) {
        Movie[] a = new Movie[3];
        a[0] = new Movie();
        a[0].title = "a";

        a[1] = new Movie();
        a[1].title = "b";

        a[2] = new Movie();
        a[2].title = "c";

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].title);
        }
    }
}
