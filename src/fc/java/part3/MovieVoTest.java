package fc.java.part3;

import fc.java.model.MovieVO;

public class MovieVoTest {
    public static void main(String[] args) {
        MovieVO m = new MovieVO("아바타", 2015, "제이크설리", "액션", 192.4f, 12);
        System.out.println(m);
    }
}
