package SecondPart_Objects;

class MovieTest {
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println("Проигрывание фильма!");
    }
}

public class Movie {
    public static void main(String[] args) {
        MovieTest one = new MovieTest();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        MovieTest two = new MovieTest();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();

        MovieTest three = new MovieTest();
        three.title = "Байт - Клуб";
        three.genre = "Трагедия, но в целом веселая!";
        three.rating = 127;

    }
}
