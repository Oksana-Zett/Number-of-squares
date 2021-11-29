package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSqrRange() {
        SQRService service = new SQRService();

        int limitLower = 500;
        int limitUpper = 1000;
        int expected = 9;

        int actual = service.sqrRange(limitLower, limitUpper);

        assertEquals(expected, actual);
    }
}