package com.example.edit;

import com.example.Scaner;
import com.example.model.LastData;
import com.example.model.ReadDataFromFile;

import java.io.IOException;

import static com.example.constants.ConstForCell.*;

public class GetLastData
{
    static ReadDataFromFile readDataFromFile = new ReadDataFromFile();

    public static LastData createLastData() throws IOException
    {
        return LastData.builder()
                .lastCounterHotWaterInBathroom(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM))
                .lastCounterColdWaterInBathroom(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM))
                .lastCounterHotWaterInKitchen(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN))
                .lastCounterColdWaterInKitchen(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN))
                .lastEnergyCounter(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_ENERGY))
                .build();
    }
}
