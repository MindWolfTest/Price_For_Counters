package com.example;

import com.example.model.LastData;
import com.example.model.DataProcessing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LastDataProcessingTest
{
    DataProcessing dataProcessing = new DataProcessing();
    @Mock
    LastData lastData;

    @Test
    public void priceHotWaterInBathroomTest()
    {
        Mockito.when(lastData.getNewCounterHotWaterInBathroom()).thenReturn(3.4);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(2.2);

        double actualResult = dataProcessing.priceHotWaterInBathroom(lastData);
        double expectedResult = 291.79;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0.001);
    }

    @Test
    public void priceColdWaterInBathroomTest()
    {
        Mockito.when(lastData.getNewCounterColdWaterInBathroom()).thenReturn(5.5);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(3.4);

        double actualResult = dataProcessing.priceColdWaterInBathroom(lastData);
        double expectedResult = 106.95;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceHotWaterInKitchenTest()
    {
        Mockito.when(lastData.getNewCounterHotWaterInKitchen()).thenReturn(10.587);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(5.87);

        double actualResult = dataProcessing.priceHotWaterInKitchen(lastData);
        double expectedResult = 1146.99;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceColdWaterInKitchenTest()
    {
        Mockito.when(lastData.getNewCounterColdWaterInKitchen()).thenReturn(547.56);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(55.6);

        double actualResult = dataProcessing.priceColdWaterInKitchen(lastData);
        double expectedResult = 25_055.52;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0.0001);
    }

    @Test
    public void usedWaterCounterTest()
    {
        Mockito.when(lastData.getNewCounterHotWaterInBathroom()).thenReturn(58.6);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(20.889);

        Mockito.when(lastData.getNewCounterColdWaterInBathroom()).thenReturn(4789.54);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(412.89);

        Mockito.when(lastData.getNewCounterHotWaterInKitchen()).thenReturn(4587.632);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(458.21);

        Mockito.when(lastData.getNewCounterColdWaterInKitchen()).thenReturn(47.6525);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(20.6);

        double actualResult = dataProcessing.usedWaterCounter(lastData);
        double expectedResult = 8570.8355;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void priceForWaterDrainageTest()
    {
        Mockito.when(lastData.getNewCounterHotWaterInBathroom()).thenReturn(58.6);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(20.889);

        Mockito.when(lastData.getNewCounterColdWaterInBathroom()).thenReturn(4789.54);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(412.89);

        Mockito.when(lastData.getNewCounterHotWaterInKitchen()).thenReturn(4587.632);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(458.21);

        Mockito.when(lastData.getNewCounterColdWaterInKitchen()).thenReturn(47.6525);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(20.6);

        double actualResult = dataProcessing.priceForWaterDrainage(lastData);
        double expectedResult = 342_576.29;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0.00001);
    }

    @Test
    public void priceForEnergyTest()
    {
        Mockito.when(lastData.getNewEnergyCounter()).thenReturn(5489.454);
        Mockito.when(lastData.getLastEnergyCounter()).thenReturn(214.21);

        double actualResult = dataProcessing.priceForEnergy(lastData);
        double expectedResult = 33_919.82;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0);
    }

    @Test
    public void totalPriceTest()
    {
        Mockito.when(lastData.getNewCounterHotWaterInBathroom()).thenReturn(58.6);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(20.889);

        Mockito.when(lastData.getNewCounterColdWaterInBathroom()).thenReturn(4_789.54);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(412.89);

        Mockito.when(lastData.getNewCounterHotWaterInKitchen()).thenReturn(4_587.632);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(458.21);

        Mockito.when(lastData.getNewCounterColdWaterInKitchen()).thenReturn(47.6_525);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(20.6);

        Mockito.when(lastData.getNewEnergyCounter()).thenReturn(5_489.454);
        Mockito.when(lastData.getLastEnergyCounter()).thenReturn(214.21);

        double actualResult = dataProcessing.totalPrice(lastData);
        double expectedResult = 1_614_056.74;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult, 0.011);
    }
}
