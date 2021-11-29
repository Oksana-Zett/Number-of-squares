package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int limitLower = 500;
        int limitUpper = 1000;
        for (int i = 10; i <= 99; i++) {
            if (i * i > limitLower && i * i < limitUpper) {
              System.out.println(i);
            }
        }
    }
}
