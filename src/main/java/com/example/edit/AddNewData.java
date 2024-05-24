package com.example.edit;

import com.example.model.NewData;

import java.io.IOException;

import static com.example.edit.GetLastData.scaner;

public class AddNewData
{
    public static NewData createLastData() throws IOException
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
