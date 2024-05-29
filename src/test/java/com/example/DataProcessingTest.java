package com.example;

import com.example.model.LastData;
import com.example.model.DataProcessing;
import com.example.model.NewData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DataProcessingTest
{
    DataProcessing dataProcessing = new DataProcessing();
    @Mock
    LastData lastData;
    @Mock
    NewData newData;

    @Test
    public void priceHotWaterInBathroomTest()
    {
        Mockito.when(newData.getNewCounterHotWaterInBathroom()).thenReturn(133.38);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(132.06);

        double actualResult = dataProcessing.priceHotWaterInBathroom(lastData, newData);
        double expectedResult = 320.97;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceColdWaterInBathroomTest()
    {
        Mockito.when(newData.getNewCounterColdWaterInBathroom()).thenReturn(250.52);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(247.44);

        double actualResult = dataProcessing.priceColdWaterInBathroom(lastData, newData);
        double expectedResult = 156.86;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceHotWaterInKitchenTest()
    {
        Mockito.when(newData.getNewCounterHotWaterInKitchen()).thenReturn(16.34);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(16.34);

        double actualResult = dataProcessing.priceHotWaterInKitchen(lastData, newData);
        double expectedResult = 0;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceColdWaterInKitchenTest()
    {
        Mockito.when(newData.getNewCounterColdWaterInKitchen()).thenReturn(69.96);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(68.55);

        double actualResult = dataProcessing.priceColdWaterInKitchen(lastData, newData);
        double expectedResult = 71.81;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void usedWaterCounterTest()
    {
        Mockito.when(newData.getNewCounterHotWaterInBathroom()).thenReturn(133.38);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(132.06);

        Mockito.when(newData.getNewCounterColdWaterInBathroom()).thenReturn(250.52);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(247.44);

        Mockito.when(newData.getNewCounterHotWaterInKitchen()).thenReturn(16.34);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(16.34);

        Mockito.when(newData.getNewCounterColdWaterInKitchen()).thenReturn(69.96);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(68.55);

        double actualResult = dataProcessing.usedWaterCounter(lastData, newData);
        double expectedResult = 5.81;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceForWaterDrainageTest()
    {
        Mockito.when(newData.getNewCounterHotWaterInBathroom()).thenReturn(133.38);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(132.06);

        Mockito.when(newData.getNewCounterColdWaterInBathroom()).thenReturn(250.52);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(247.44);

        Mockito.when(newData.getNewCounterHotWaterInKitchen()).thenReturn(16.34);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(16.34);

        Mockito.when(newData.getNewCounterColdWaterInKitchen()).thenReturn(69.96);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(68.55);

        double actualResult = dataProcessing.priceForWaterDrainage(lastData, newData);
        double expectedResult = 232.23;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceForEnergyTest()
    {
        Mockito.when(newData.getNewEnergyCounter()).thenReturn(13396.0);
        Mockito.when(lastData.getLastEnergyCounter()).thenReturn(13184.0);

        double actualResult = dataProcessing.priceForEnergy(lastData, newData);
        double expectedResult = 1363.16;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void totalPriceTest()
    {
        Mockito.when(newData.getNewCounterHotWaterInBathroom()).thenReturn(133.38);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(132.06);

        Mockito.when(newData.getNewCounterColdWaterInBathroom()).thenReturn(250.52);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(247.44);

        Mockito.when(newData.getNewCounterHotWaterInKitchen()).thenReturn(16.34);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(16.34);

        Mockito.when(newData.getNewCounterColdWaterInKitchen()).thenReturn(69.96);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(68.55);

        Mockito.when(newData.getNewEnergyCounter()).thenReturn(13396.0);
        Mockito.when(lastData.getLastEnergyCounter()).thenReturn(13184.0);

        double actualResult = dataProcessing.totalPrice(lastData, newData);
        double expectedResult = 2145.03;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }
}
