package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"-9801, -100, 0", "0, 1, 0", "-100, 120, 1", "200, 300, 3",
            "50, 4900, 61", "100, 9801, 90",})
    void shouldNumberOfSquare(long lborder, long rborder, long expected) {
        SQRService sqrService = new SQRService();

        long actual = sqrService.numberOfSquare(lborder, rborder);
        assertEquals(expected, actual);
    }
}