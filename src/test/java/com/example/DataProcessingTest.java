package com.example;

import com.example.model.DataProcessing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataProcessingTest
{
    DataProcessing dataProcessing =new DataProcessing();

    @Test
    public void priceTest()
    {
        double actualResult = dataProcessing.price(1,2,5);
        assertEquals("\nОшибка!\nрезультат не совпадает!",5,actualResult,0);
    }

    @Test
    public void usedWaterTest()
    {
        double actualResult = dataProcessing.usedWater(1,2);
        assertEquals("\nОшибка!\nрезультат не совпадает!", 1,actualResult,0);
    }

    @Test
    public void usedWaterDrainageTest()
    {
        double actualResult = dataProcessing.usedWaterDrainage(1,1,
                1,1);
        assertEquals("\nОшибка!\nрезультат не совпадает!", 4,actualResult,0);
    }

    @Test
    public void priceForWaterDrainageTest()
    {
        double actualResult = dataProcessing.priceForWaterDrainage(1,1,
                1,1,10);
        assertEquals("\nОшибка!\nрезультат не совпадает!", 40,actualResult,0);
    }

    @Test
    public void fullPriceForAllCountersTest()
    {
        double actualResult = dataProcessing.fullPriceForAllCounters(1,1,
                1,1,1,1);
        assertEquals("\nОшибка!\nрезультат не совпадает!", 6,actualResult,0);
    }

}
