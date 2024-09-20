package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("제목 입력");
        String title = sc.nextLine();
        System.out.println(title);

        System.out.println("가격 입력");
        int price = sc.nextInt();
        System.out.println(price);

        sc.nextLine();

        System.out.println("출판사 입력");
        String company= sc.nextLine();
        System.out.println(company);

        System.out.println("저자 입력");
        String author = sc.nextLine();
        System.out.println(author);

        System.out.println("페이지수 입력");
        int page = sc.nextInt();
        System.out.println(page);

        sc.nextLine();

        System.out.println("isbn 입력");
        String isbn = sc.nextLine();
        System.out.println(isbn);
        sc.close();

        Book book = new Book();
        book.title = title;
        book.author = author;
        book.page = page;
        book.isbn = isbn;
        book.price = price;
        System.out.println(book.title+"\t"+book.author+"\t"+book.page+"\t"+book.isbn);

    }
}
