package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiseTest {

    @Test
    public void calcSquares() {
        SQRService service = new SQRService();

        int actual = service.howManySquares(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
        System.out.println("кол-во квадратов для диаплзона от 200 до 300 = " + actual);
    }

    @Test
    public void calcSquaresZero() {
        SQRService service = new SQRService();

        int actual = service.howManySquares(0, 1000000);
        int expected = 90;
        assertEquals(expected, actual);
        System.out.println("кол-во квадратов для диаплзона от 0 до 1000000 = " + actual);
    }

    @Test
    public void calcSquaresJustForOne() {
        SQRService service = new SQRService();

        int actual = service.howManySquares(0, 100);
        int expected = 1;
        assertEquals(expected, actual);
        System.out.println("кол-во квадратов для диаплзона от 0 до 1 = " + actual);
    }
}
