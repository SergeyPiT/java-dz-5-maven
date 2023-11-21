package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class RestServiceCsvTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestServiceCsvTest.csv")
    public void differentBalance(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();


        int actual = service.restCalc(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }


}
