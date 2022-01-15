package practice.task10;

import practice.iterator.List;

import java.util.*;

public class Cinema {

    Map<Integer, List<Film>>  cinemaList = new LinkedHashMap<>();

    public void addNewCinema(List<Film> films) {
        for (Film f : films) {
            cinemaList.put(f.getYear(), films);
        }
//        List<Film> films = null;
//        films.add(film);
//        int year = film.getYear();
//        cinemaList.put(year, films);
//        for (Film f : films) {
//
//        }

    }

    public Map<Integer, List<Film>> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(Map<Integer, List<Film>> cinemaList) {
        this.cinemaList = cinemaList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(cinemaList, cinema.cinemaList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinemaList);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cinemaList=" + cinemaList +
                '}';
    }

}
