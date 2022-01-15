package practice.task10;

import java.util.Objects;

public class Film {

    private int id;
    private int year;
    private String genre;
    private int rating;


    public Film() {

    }

    public Film(int id, int year, String genre, int rating) {
        this.id = id;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && year == film.year && rating == film.rating && Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, genre, rating);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
