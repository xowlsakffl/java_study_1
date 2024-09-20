package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "자바";
        book.price = 30000;
        book.company = "패스트 캠퍼스";
        book.author = "박메일";
        book.page = 800;
        book.isbn = "ISBN-10230";
        System.out.println(book.title+"\t"+book.price+"\t"+book.company+"\t"+book.author+"\t"+book.page+"\t"+book.isbn+"\t");

    }
}
