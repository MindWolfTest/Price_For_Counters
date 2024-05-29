package com.example.edit;

import com.example.model.NewData;

import java.io.IOException;


public class AddNewData
{
    public static NewData createNewData(int year, String month, double newDataCounterHotWaterInBathroom,
                                        double newDataCounterColdWaterInBathroom, double newDataCounterHotWaterInKitchen,
                                        double newDataCounterColdWaterInKitchen, double newDataEnergyCounter) throws IOException
    {
        return NewData.builder()
                .year(year)
                .month(month)
                .newCounterHotWaterInBathroom(newDataCounterHotWaterInBathroom)
                .newCounterColdWaterInBathroom(newDataCounterColdWaterInBathroom)
                .newCounterHotWaterInKitchen(newDataCounterHotWaterInKitchen)
                .newCounterColdWaterInKitchen(newDataCounterColdWaterInKitchen)
                .newEnergyCounter(newDataEnergyCounter)
                .build();
    }
}
