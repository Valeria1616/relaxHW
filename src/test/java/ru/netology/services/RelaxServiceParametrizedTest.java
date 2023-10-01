package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RelaxServiceParametrizedTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Relax.csv")
    public void shouldCalculateAmountMonthOfRest(int expected, int income, int expenses, int threshold) {

        RelaxService service = new RelaxService();

        int actual = service.calcMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}