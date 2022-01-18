package practice.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Film>  films = new ArrayList<>();
        films.add(new Film(1, 1990, "test", 6));
        Cinema cinema = new Cinema();
    //    cinema.addNewCinema(films);
//        cinema.addNewCinema(new Film(1, 1990, "Comedy", 10));
//        cinema.addNewCinema(new Film(1, 1990, "Humor", 10));

        System.out.println(cinema);
    }
}
