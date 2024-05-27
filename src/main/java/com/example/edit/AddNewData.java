package com.example.edit;

import com.example.Scaner;
import com.example.model.NewData;

import java.io.IOException;


public class AddNewData
{
    private static Scaner scaner = new Scaner();
    public static NewData createNewData() throws IOException
    {
        return NewData.builder()
                .year(scaner.enterYear())
                .month(scaner.enterMonth())
                .newCounterHotWaterInBathroom(scaner.enterNewDataCounterHotWaterInBathroom())
                .newCounterColdWaterInBathroom(scaner.enterNewDataCounterColdWaterInBathroom())
                .newCounterHotWaterInKitchen(scaner.enterNewDataCounterHotWaterInKitchen())
                .newCounterColdWaterInKitchen(scaner.enterNewDataCounterColdWaterInKitchen())
                .newEnergyCounter(scaner.enterNewDataEnergyCounter())
                .build();
    }
}
