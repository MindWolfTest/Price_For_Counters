package com.example;

import com.example.model.Data;
import com.example.model.DataProcessing;
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
    Data data;

    @Test
    public void priceHotWaterInBathroomTest()
    {
        Mockito.when(data.getNewCounterHotWaterInBathroom()).thenReturn(3.4);
        Mockito.when(data.getLastCounterHotWaterInBathroom()).thenReturn(2.2);

        double actualResult = dataProcessing.priceHotWaterInBathroom(data);
        double expectedResult = 291.79;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0.001);
    }

    @Test
    public void priceColdWaterInBathroomTest()
    {
        Mockito.when(data.getNewCounterColdWaterInBathroom()).thenReturn(5.5);
        Mockito.when(data.getLastCounterColdWaterInBathroom()).thenReturn(3.4);

        double actualResult = dataProcessing.priceColdWaterInBathroom(data);
        double expectedResult = 106.95;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceHotWaterInKitchenTest()
    {
        Mockito.when(data.getNewCounterHotWaterInKitchen()).thenReturn(10.587);
        Mockito.when(data.getLastCounterHotWaterInKitchen()).thenReturn(5.87);

        double actualResult = dataProcessing.priceHotWaterInKitchen(data);
        double expectedResult = 1146.99;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceColdWaterInKitchenTest()
    {
        Mockito.when(data.getNewCounterColdWaterInKitchen()).thenReturn(547.56);
        Mockito.when(data.getLastCounterColdWaterInKitchen()).thenReturn(55.6);

        double actualResult = dataProcessing.priceColdWaterInKitchen(data);
        double expectedResult = 25_055.52;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0.0001);
    }

    @Test
    public void usedWaterCounterTest()
    {
        Mockito.when(data.getNewCounterHotWaterInBathroom()).thenReturn(58.6);
        Mockito.when(data.getLastCounterHotWaterInBathroom()).thenReturn(20.889);

        Mockito.when(data.getNewCounterColdWaterInBathroom()).thenReturn(4789.54);
        Mockito.when(data.getLastCounterColdWaterInBathroom()).thenReturn(412.89);

        Mockito.when(data.getNewCounterHotWaterInKitchen()).thenReturn(4587.632);
        Mockito.when(data.getLastCounterHotWaterInKitchen()).thenReturn(458.21);

        Mockito.when(data.getNewCounterColdWaterInKitchen()).thenReturn(47.6525);
        Mockito.when(data.getLastCounterColdWaterInKitchen()).thenReturn(20.6);

        double actualResult = dataProcessing.usedWaterCounter(data);
        double expectedResult = 8570.8355;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceForWaterDrainageTest()
    {
        Mockito.when(data.getNewCounterHotWaterInBathroom()).thenReturn(58.6);
        Mockito.when(data.getLastCounterHotWaterInBathroom()).thenReturn(20.889);

        Mockito.when(data.getNewCounterColdWaterInBathroom()).thenReturn(4789.54);
        Mockito.when(data.getLastCounterColdWaterInBathroom()).thenReturn(412.89);

        Mockito.when(data.getNewCounterHotWaterInKitchen()).thenReturn(4587.632);
        Mockito.when(data.getLastCounterHotWaterInKitchen()).thenReturn(458.21);

        Mockito.when(data.getNewCounterColdWaterInKitchen()).thenReturn(47.6525);
        Mockito.when(data.getLastCounterColdWaterInKitchen()).thenReturn(20.6);

        double actualResult = dataProcessing.priceForWaterDrainage(data);
        double expectedResult = 342_576.29;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0.00001);
    }

    @Test
    public void priceForEnergyTest()
    {
        Mockito.when(data.getNewEnergyCounter()).thenReturn(5489.454);
        Mockito.when(data.getLastEnergyCounter()).thenReturn(214.21);

        double actualResult = dataProcessing.priceForEnergy(data);
        double expectedResult = 33_919.82;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void totalPriceTest()
    {
        Mockito.when(data.getNewCounterHotWaterInBathroom()).thenReturn(58.6);
        Mockito.when(data.getLastCounterHotWaterInBathroom()).thenReturn(20.889);

        Mockito.when(data.getNewCounterColdWaterInBathroom()).thenReturn(4_789.54);
        Mockito.when(data.getLastCounterColdWaterInBathroom()).thenReturn(412.89);

        Mockito.when(data.getNewCounterHotWaterInKitchen()).thenReturn(4_587.632);
        Mockito.when(data.getLastCounterHotWaterInKitchen()).thenReturn(458.21);

        Mockito.when(data.getNewCounterColdWaterInKitchen()).thenReturn(47.6_525);
        Mockito.when(data.getLastCounterColdWaterInKitchen()).thenReturn(20.6);

        Mockito.when(data.getNewEnergyCounter()).thenReturn(5_489.454);
        Mockito.when(data.getLastEnergyCounter()).thenReturn(214.21);

        double actualResult = dataProcessing.totalPrice(data);
        double expectedResult = 1_614_056.74;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0.011);
    }
}
