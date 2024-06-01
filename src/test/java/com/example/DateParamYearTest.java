package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DateParamYearTest
{
    Date dateTest = new Date();

    @Mock
    LocalDateTime date;

    @Parameterized.Parameter
    public int year;
    @Parameterized.Parameter(1)
    public int expectedYear;

    @Parameterized.Parameters()
    public static Object[][] data()
    {
        return new Object[][]{
                {2021, 2021},
                {1980, 1980},
                {2024, 2024},
                {5047,5047}
        };
    }

    @Before
    public void setUp()
    {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getYearTest()
    {
        LocalDate fixedDate = LocalDate.of(year, 5, 1);
        Clock mockClock = Clock.fixed(fixedDate.atStartOfDay(ZoneId.systemDefault()).toInstant(), ZoneId.systemDefault());

        /*LocalDateTime */date = LocalDateTime.now(mockClock);
        //date.getYear();
        Mockito.when(date.getYear()).thenReturn(year);
        //date.getYear();
        int actualResult = dateTest.getCurrentYear();
        assertEquals("\nОшибка!!!\nгод не совпадает!",expectedYear, actualResult);
    }
}
