package fc.java.part2;

public class BasicArrayTest {
    public static void main(String[] args) {
        float[] a = {10.f, 20.f, 30.f, 40.f};

        Book[] b = new Book[3];
        b[0] = new Book();
        b[0].title = "자바";
        b[0].company = "company1";
        b[0].author = "ms";
        b[0].price = 3000;
        b[0].page = 300;
        b[0].isbn = "1233123IS";
        System.out.println(b[0].title+"\t"+b[0].company+"\t"+b[0].author+"\t"+b[0].price+"\t"+b[0].page+"\t"+b[0].isbn);

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i].title+"\t"+b[i].company+"\t"+b[i].author+"\t"+b[i].price+"\t"+b[i].page+"\t"+b[i].isbn);
        }
    }
}
