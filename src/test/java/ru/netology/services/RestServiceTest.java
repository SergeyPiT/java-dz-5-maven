package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    public void smallBalance () {
        RestService service = new RestService();

        int expected = 3;
        int actual = service.restCalc(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bigBalance () {
        RestService service = new RestService();

        int expected = 2;
        int actual = service.restCalc(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
