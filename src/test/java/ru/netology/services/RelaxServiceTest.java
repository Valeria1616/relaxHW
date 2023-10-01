package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RelaxServiceTest {

    @Test
    public void shouldCalculate3MonthOfRest() {
        RelaxService service = new RelaxService();

        int actual = service.calcMonth(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate2MonthOfRest() {
        RelaxService service = new RelaxService();

        int actual = service.calcMonth(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}