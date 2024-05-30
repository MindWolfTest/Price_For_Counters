package com.example;

import com.example.model.NewData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewDataTest
{
    NewData newData = new NewData();
    @Test
    public void setGetYearTest()
    {
        newData.setYear(2021);

        int actualResult = newData.getYear();
        int expectedResult = 2021;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetMonthTest()
    {
        newData.setMonth("Месяц");

        String actualResult = newData.getMonth();
        String expectedResult = "Месяц";

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetNewCounterHotWaterInTheBathroomTest()
    {
        newData.setNewCounterHotWaterInBathroom(212.45);

        double actualResult = newData.getNewCounterHotWaterInBathroom();
        double expectedResult = 212.45;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterColdWaterInBathroomTest()
    {
        newData.setNewCounterColdWaterInBathroom(547.54);

        double actualResult = newData.getNewCounterColdWaterInBathroom();
        double expectedResult = 547.54;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterHotWaterInKitchenTest()
    {
        newData.setNewCounterHotWaterInKitchen(548.6475);

        double actualResult = newData.getNewCounterHotWaterInKitchen();
        double expectedResult = 548.6475;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewCounterColdWaterInKitchenTest()
    {
        newData.setNewCounterColdWaterInKitchen(547.453);

        double actualResult = newData.getNewCounterColdWaterInKitchen();
        double expectedResult = 547.453;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void setGetNewEnergyCounterTest()
    {
        newData.setNewEnergyCounter(4787.23212);

        double actualResult = newData.getNewEnergyCounter();
        double expectedResult = 4787.23212;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }
}
