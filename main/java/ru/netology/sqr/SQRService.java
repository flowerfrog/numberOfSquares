package ru.netology.sqr;

public class SQRService {
    public long numberOfSquare(long lborder, long rborder) {
        long counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lborder && i * i <= rborder) {
                counter = counter + 1;
            }
        }
        System.out.println("число квадратов, попавших в диапазон от " + lborder + " до " + rborder + " = " + counter);
        return counter;
    }
}
