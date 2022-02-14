package ru.netology.sqr;

public class SQRService {

    public int squares(int first, int second) {

        int counter = 0;

        for (int i = 10; i <= 99; i++)
            if (i * i >= first && i * i <= second) {
                counter++;
            }


        return counter;
    }
}
