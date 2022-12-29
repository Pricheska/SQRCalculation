package ru.netology.sqr;

public class SQRService {

    public int howManySquares(int from, int to) {
        int ch = 0;
        for (int i = 10; i <= 99; i++) {
            int squareOfI = i * i;
            if (squareOfI >= from && squareOfI <= to) {
                ch++;
            }
        }
        return ch;
    }
}