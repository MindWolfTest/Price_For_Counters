package com.example;

import com.example.model.LastData;
import com.example.model.DataProcessing;
import com.example.model.NewData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.ConstantCounters.*;
import static com.example.constants.ConstantPrice.*;
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
        Mockito.when(newData.getNewCounterHotWaterInBathroom()).thenReturn(NEW_COUNTER_HOT_WATER_IN_BATHROOM);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(LAST_COUNTER_HOT_WATER_IN_BATHROOM);

        double actualResult = dataProcessing.priceHotWaterInBathroom(lastData, newData);

        assertEquals("\nОшибка!\nрезультат не корректный", RESULT_PRICE_HOT_WATER_IN_BATHROOM, actualResult, 0);
    }

    @Test
    public void priceColdWaterInBathroomTest()
    {
        Mockito.when(newData.getNewCounterColdWaterInBathroom()).thenReturn(NEW_COUNTER_COLD_WATER_IN_BATHROOM);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(LAST_COUNTER_COLD_WATER_IN_BATHROOM);

        double actualResult = dataProcessing.priceColdWaterInBathroom(lastData, newData);

        assertEquals("\nОшибка!\nрезультат не корректный", RESULT_PRICE_COLD_WATER_IN_BATHROOM, actualResult, 0);
    }

    @Test
    public void priceHotWaterInKitchenTest()
    {
        Mockito.when(newData.getNewCounterHotWaterInKitchen()).thenReturn(NEW_COUNTER_HOT_WATER_IN_KITCHEN);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(LAST_COUNTER_HOT_WATER_IN_KITCHEN);

        double actualResult = dataProcessing.priceHotWaterInKitchen(lastData, newData);

        assertEquals("\nОшибка!\nрезультат не корректный", RESULT_PRICE_HOT_WATER_IN_KITCHEN, actualResult, 0);
    }

    @Test
    public void priceColdWaterInKitchenTest()
    {
        Mockito.when(newData.getNewCounterColdWaterInKitchen()).thenReturn(NEW_COUNTER_COLD_WATER_IN_KITCHEN);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(LAST_COUNTER_COLD_WATER_IN_KITCHEN);

        double actualResult = dataProcessing.priceColdWaterInKitchen(lastData, newData);

        assertEquals("\nОшибка!\nрезультат не корректный", RESULT_PRICE_COLD_WATER_IN_KITCHEN, actualResult, 0);
    }

    @Test
    public void usedWaterCounterTest()
    {
        Mockito.when(newData.getNewCounterHotWaterInBathroom()).thenReturn(NEW_COUNTER_HOT_WATER_IN_BATHROOM);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(LAST_COUNTER_HOT_WATER_IN_BATHROOM);

        Mockito.when(newData.getNewCounterColdWaterInBathroom()).thenReturn(NEW_COUNTER_COLD_WATER_IN_BATHROOM);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(LAST_COUNTER_COLD_WATER_IN_BATHROOM);

        Mockito.when(newData.getNewCounterHotWaterInKitchen()).thenReturn(NEW_COUNTER_HOT_WATER_IN_KITCHEN);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(LAST_COUNTER_HOT_WATER_IN_KITCHEN);

        Mockito.when(newData.getNewCounterColdWaterInKitchen()).thenReturn(NEW_COUNTER_COLD_WATER_IN_KITCHEN);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(LAST_COUNTER_COLD_WATER_IN_KITCHEN);

        double actualResult = dataProcessing.usedWaterCounter(lastData, newData);

        assertEquals("\nОшибка!\nрезультат не корректный", RESULT_USED_WATER_DRAINAGE, actualResult, 0);
    }

    @Test
    public void priceForWaterDrainageTest()
    {
        Mockito.when(newData.getNewCounterHotWaterInBathroom()).thenReturn(NEW_COUNTER_HOT_WATER_IN_BATHROOM);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(LAST_COUNTER_HOT_WATER_IN_BATHROOM);

        Mockito.when(newData.getNewCounterColdWaterInBathroom()).thenReturn(NEW_COUNTER_COLD_WATER_IN_BATHROOM);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(LAST_COUNTER_COLD_WATER_IN_BATHROOM);

        Mockito.when(newData.getNewCounterHotWaterInKitchen()).thenReturn(NEW_COUNTER_HOT_WATER_IN_KITCHEN);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(LAST_COUNTER_HOT_WATER_IN_KITCHEN);

        Mockito.when(newData.getNewCounterColdWaterInKitchen()).thenReturn(NEW_COUNTER_COLD_WATER_IN_KITCHEN);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(LAST_COUNTER_COLD_WATER_IN_KITCHEN);

        double actualResult = dataProcessing.priceForWaterDrainage(lastData, newData);

        assertEquals("\nОшибка!\nрезультат не корректный", RESULT_PRICE_FOR_WATER_DRAINAGE, actualResult, 0);
    }

    @Test
    public void priceForEnergyTest()
    {
        Mockito.when(newData.getNewEnergyCounter()).thenReturn(NEW_ENERGY_COUNTER);
        Mockito.when(lastData.getLastEnergyCounter()).thenReturn(LAST_ENERGY_COUNTER);

        double actualResult = dataProcessing.priceForEnergy(lastData, newData);

        assertEquals("\nОшибка!\nрезультат не корректный", RESULT_PRICE_FOR_ENERGY, actualResult, 0);
    }

    @Test
    public void totalPriceTest()
    {
        Mockito.when(newData.getNewCounterHotWaterInBathroom()).thenReturn(NEW_COUNTER_HOT_WATER_IN_BATHROOM);
        Mockito.when(lastData.getLastCounterHotWaterInBathroom()).thenReturn(LAST_COUNTER_HOT_WATER_IN_BATHROOM);

        Mockito.when(newData.getNewCounterColdWaterInBathroom()).thenReturn(NEW_COUNTER_COLD_WATER_IN_BATHROOM);
        Mockito.when(lastData.getLastCounterColdWaterInBathroom()).thenReturn(LAST_COUNTER_COLD_WATER_IN_BATHROOM);

        Mockito.when(newData.getNewCounterHotWaterInKitchen()).thenReturn(NEW_COUNTER_HOT_WATER_IN_KITCHEN);
        Mockito.when(lastData.getLastCounterHotWaterInKitchen()).thenReturn(LAST_COUNTER_HOT_WATER_IN_KITCHEN);

        Mockito.when(newData.getNewCounterColdWaterInKitchen()).thenReturn(NEW_COUNTER_COLD_WATER_IN_KITCHEN);
        Mockito.when(lastData.getLastCounterColdWaterInKitchen()).thenReturn(LAST_COUNTER_COLD_WATER_IN_KITCHEN);

        Mockito.when(newData.getNewEnergyCounter()).thenReturn(NEW_ENERGY_COUNTER);
        Mockito.when(lastData.getLastEnergyCounter()).thenReturn(LAST_ENERGY_COUNTER);

        double actualResult = dataProcessing.totalPrice(lastData, newData);

        assertEquals("\nОшибка!\nрезультат не корректный", RESULT_TOTAL_PRICE, actualResult, 0);
    }
}
