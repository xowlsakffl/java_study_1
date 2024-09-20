package fc.java.part2;

public class MovieExam {
    public static void main(String[] args) {
        Movie a = new Movie();
        a.director = "minseong";
        a.title = "가나다";
        a.duration = 2015;
        a.genre = "zz";
        System.out.println(a.director+"\t"+a.title+"\t"+a.duration+"\t"+a.genre);
    }
}
