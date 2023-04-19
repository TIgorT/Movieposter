package ru.netology.manager;

public class PosterManager {
    private String[] listOfFilms = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addingANewMovie(String film) {
        String[] moviePoster = new String[listOfFilms.length + 1];
        for (int i = 0; i < listOfFilms.length; i++) {
            moviePoster[i] = listOfFilms[i];
        }
        moviePoster[moviePoster.length - 1] = film;
        listOfFilms = moviePoster;
    }

    public String[] findAll() {
        return listOfFilms;
    }

    public String[] findLast() {
        int resultLength;
        if (listOfFilms.length < limit) {
            resultLength = listOfFilms.length;
        } else {
            resultLength = limit;
        }
        String[] addedMovies = new String[resultLength];
        for (int i = 0; i < addedMovies.length; i++) {
            addedMovies[i] = listOfFilms[listOfFilms.length - 1 - i];
        }
        return addedMovies;
    }
}
