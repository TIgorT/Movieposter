package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();

    @Test

    public void functionAddingMoviesTestFirst() {
        manager.findAll();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void functionAddingMoviesTestSecond() {
        manager.addingANewMovie("Бладшот");
        manager.addingANewMovie("Вперёд");
        manager.addingANewMovie("Отель Белград");
        manager.addingANewMovie("Джентельмены");
        manager.addingANewMovie("Человек-невидимка");
        manager.addingANewMovie("Тролли. Мировой тур");
        manager.addingANewMovie("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void functionFindLastTestTheThird() {
        manager.findAll();
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void functionFindLastTestTheFourth() {
        manager.addingANewMovie("Бладшот");
        manager.addingANewMovie("Вперёд");
        manager.addingANewMovie("Отель Белград");
        manager.findLast();
        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void functionFindLastTestTheFifth() {
        manager.addingANewMovie("Бладшот");
        manager.addingANewMovie("Вперёд");
        manager.addingANewMovie("Отель Белград");
        manager.addingANewMovie("Джентельмены");
        manager.addingANewMovie("Человек-невидимка");
        manager.addingANewMovie("Тролли. Мировой тур");
        manager.addingANewMovie("Номер один");
        manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void functionFindLastTestTheSixth() {
        PosterManager manager = new PosterManager(7);
        manager.addingANewMovie("Бладшот");
        manager.addingANewMovie("Вперёд");
        manager.addingANewMovie("Отель Белград");
        manager.addingANewMovie("Джентельмены");
        manager.addingANewMovie("Человек-невидимка");
        manager.addingANewMovie("Тролли. Мировой тур");
        manager.addingANewMovie("Номер один");
        manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void functionFindLastTestTheSeven() {
        PosterManager manager = new PosterManager(8);
        manager.addingANewMovie("Бладшот");
        manager.addingANewMovie("Вперёд");
        manager.addingANewMovie("Отель Белград");
        manager.addingANewMovie("Джентельмены");
        manager.addingANewMovie("Человек-невидимка");
        manager.addingANewMovie("Тролли. Мировой тур");
        manager.addingANewMovie("Номер один");
        manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void functionFindLastTestTheEight() {
        PosterManager manager = new PosterManager(3);
        manager.addingANewMovie("Бладшот");
        manager.addingANewMovie("Вперёд");
        manager.addingANewMovie("Отель Белград");
        manager.addingANewMovie("Джентельмены");
        manager.addingANewMovie("Человек-невидимка");
        manager.addingANewMovie("Тролли. Мировой тур");
        manager.addingANewMovie("Номер один");
        manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}

