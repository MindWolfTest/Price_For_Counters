package com.example.edit;

import com.example.model.LastData;
import com.example.model.ReadDataFromFile;
import com.example.model.RowNumber;

import java.io.IOException;

import static com.example.constants.ConstForCell.*;

public class GetLastData
{
    static ReadDataFromFile readDataFromFile = new ReadDataFromFile();

    public static LastData createLastData(RowNumber rowNumber) throws IOException
    {
        return LastData.builder()
                .lastCounterHotWaterInBathroom(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM, rowNumber))
                .lastCounterColdWaterInBathroom(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM, rowNumber))
                .lastCounterHotWaterInKitchen(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN, rowNumber))
                .lastCounterColdWaterInKitchen(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN, rowNumber))
                .lastEnergyCounter(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_ENERGY, rowNumber))
                .build();
    }
}
