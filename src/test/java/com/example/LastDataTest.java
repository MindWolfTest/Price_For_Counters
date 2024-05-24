package com.example;

import com.example.model.LastData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastDataTest
{
    LastData lastData = new LastData();

    @Test
    public void setGetLastRowTest()
    {
        lastData.setLastRow(24);

        int actualResult = lastData.getLastRow();
        int expectedResult = 24;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetNewRowTest()
    {
        lastData.setNewRow(12);

        int actualResult = lastData.getNewRow();
        int expectedResult = 12;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetYearTest()
    {
        lastData.setYear(2021);

        int actualResult = lastData.getYear();
        int expectedResult = 2021;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetMonthTest()
    {
        lastData.setMonth("Месяц");

        String actualResult = lastData.getMonth();
        String expectedResult = "Месяц";

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetLastCounterHotWaterInTheBathroomTest()
    {
        lastData.setLastCounterHotWaterInBathroom(212.45);

        double actualResult = lastData.getLastCounterHotWaterInBathroom();
        double expectedResult = 212.45;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterHotWaterInTheBathroomTest()
    {
        lastData.setNewCounterHotWaterInBathroom(212.45);

        double actualResult = lastData.getNewCounterHotWaterInBathroom();
        double expectedResult = 212.45;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterColdWaterInBathroomTest()
    {
        lastData.setNewCounterColdWaterInBathroom(547.54);

        double actualResult = lastData.getNewCounterColdWaterInBathroom();
        double expectedResult = 547.54;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetLastCounterColdWaterInBathroomTest()
    {
        lastData.setLastCounterColdWaterInBathroom(478.65);

        double actualResult = lastData.getLastCounterColdWaterInBathroom();
        double expectedResult = 478.65;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterHotWaterInKitchenTest()
    {
        lastData.setNewCounterHotWaterInKitchen(548.6475);

        double actualResult = lastData.getNewCounterHotWaterInKitchen();
        double expectedResult = 548.6475;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetLastCounterHotWaterInKitchenTest()
    {
        lastData.setLastCounterHotWaterInKitchen(487.56);

        double actualResult = lastData.getLastCounterHotWaterInKitchen();
        double expectedResult = 487.56;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterColdWaterInKitchenTest()
    {
        lastData.setNewCounterColdWaterInKitchen(547.453);

        double actualResult = lastData.getNewCounterColdWaterInKitchen();
        double expectedResult = 547.453;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetLastCounterColdWaterInKitchenTest()
    {
        lastData.setLastCounterColdWaterInKitchen(421.234);

        double actualResult = lastData.getLastCounterColdWaterInKitchen();
        double expectedResult = 421.234;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewEnergyCounterTest()
    {
        lastData.setNewEnergyCounter(4787.23212);

        double actualResult = lastData.getNewEnergyCounter();
        double expectedResult = 4787.23212;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetLastEnergyCounterTest()
    {
        lastData.setLastEnergyCounter(4787.8);

        double actualResult = lastData.getLastEnergyCounter();
        double expectedResult = 4787.8;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }
}
