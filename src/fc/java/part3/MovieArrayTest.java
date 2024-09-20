package fc.java.part3;

import fc.java.model.MovieVO;

public class MovieArrayTest {
    public static void main(String[] args) {
        MovieVO[] movies = new MovieVO[3];
        movies[0] = new MovieVO("아바타",2012,"ㅁㅁ","ㄴㄴ",2.4f, 12);
        movies[1] = new MovieVO("형",2012,"ㅁㅁ","ㄴㄴ",2.4f, 12);
        movies[2] = new MovieVO("달콤한유혹",2012,"ㅁㅁ","ㄴㄴ",2.4f, 12);

        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].toString());
        }

        for (MovieVO movie : movies) {
            System.out.println(movie.toString());
        }
    }
}
