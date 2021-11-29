package ru.netology.sqr;

public class SQRService {
    public int sqrRange (int limitLower, int limitUpper){
        int j = 0; // j - это счетчик
        for (int i = 10; i <= 99; i++) {
            if (i * i > limitLower && i * i < limitUpper) {
                j = j + 1;
            }
            if (i * i > limitUpper) {
               break;
            }
        }
                return j;
    }

}
