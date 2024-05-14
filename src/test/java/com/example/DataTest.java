package com.example;

import com.example.model.Data;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataTest
{
    Data data = new Data();

    @Test
    public void setGetLastRowTest()
    {
        data.setLastRow(24);

        int actualResult = data.getLastRow();
        int expectedResult = 24;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetNewRowTest()
    {
        data.setNewRow(12);

        int actualResult = data.getNewRow();
        int expectedResult = 12;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetYearTest()
    {
        data.setYear(2021);

        int actualResult = data.getYear();
        int expectedResult = 2021;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetMonthTest()
    {
        data.setMonth("Месяц");

        String actualResult = data.getMonth();
        String expectedResult = "Месяц";

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetLastCounterHotWaterInTheBathroomTest()
    {
        data.setLastCounterHotWaterInBathroom(212.45);

        double actualResult = data.getLastCounterHotWaterInBathroom();
        double expectedResult = 212.45;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterHotWaterInTheBathroomTest()
    {
        data.setNewCounterHotWaterInBathroom(212.45);

        double actualResult = data.getNewCounterHotWaterInBathroom();
        double expectedResult = 212.45;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterColdWaterInBathroomTest()
    {
        data.setNewCounterColdWaterInBathroom(547.54);

        double actualResult = data.getNewCounterColdWaterInBathroom();
        double expectedResult = 547.54;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetLastCounterColdWaterInBathroomTest()
    {
        data.setLastCounterColdWaterInBathroom(478.65);

        double actualResult = data.getLastCounterColdWaterInBathroom();
        double expectedResult = 478.65;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterHotWaterInKitchenTest()
    {
        data.setNewCounterHotWaterInKitchen(548.6475);

        double actualResult = data.getNewCounterHotWaterInKitchen();
        double expectedResult = 548.6475;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetLastCounterHotWaterInKitchenTest()
    {
        data.setLastCounterHotWaterInKitchen(487.56);

        double actualResult = data.getLastCounterHotWaterInKitchen();
        double expectedResult = 487.56;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterColdWaterInKitchenTest()
    {
        data.setNewCounterColdWaterInKitchen(547.453);

        double actualResult = data.getNewCounterColdWaterInKitchen();
        double expectedResult = 547.453;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetLastCounterColdWaterInKitchenTest()
    {
        data.setLastCounterColdWaterInKitchen(421.234);

        double actualResult = data.getLastCounterColdWaterInKitchen();
        double expectedResult = 421.234;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewEnergyCounterTest()
    {
        data.setNewEnergyCounter(4787.23212);

        double actualResult = data.getNewEnergyCounter();
        double expectedResult = 4787.23212;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetLastEnergyCounterTest()
    {
        data.setLastEnergyCounter(4787.8);

        double actualResult = data.getLastEnergyCounter();
        double expectedResult = 4787.8;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }
}
