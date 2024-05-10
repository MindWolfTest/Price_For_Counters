package com.example.edit;

import com.example.Scaner;
import com.example.model.Data;
import com.example.model.ReadDataFromFile;

import java.io.IOException;

import static com.example.constants.ConstForCell.*;

public class EditData
{
    static Scaner scaner = new Scaner();
    static ReadDataFromFile readDataFromFile = new ReadDataFromFile();

    public static Data createData() throws IOException
    {
        return Data.builder()
                .lastRow(readDataFromFile.getNumberOfLastRow())
                .newRow(readDataFromFile.getNumberOfNewRow())
                .lastCounterHotWaterInTheBathroom(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM))
                .lastCounterColdWaterInTheBathroom(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM))
                .lastCounterHotWaterInTheKitchen(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN))
                .lastCounterColdWaterInTheKitchen(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN))
                .lastEnergyCounter(readDataFromFile.getDataFromCellLastCounter(NUMBER_OF_CELL_COUNTER_ENERGY))
//                .year(scaner.enterYear())
//                .month(scaner.enterMonth())
                .newCounterHotWaterInBathroom(scaner.enterNewDataCounterHotWaterInBathroom())
//                .newCounterColdWaterInBathroom(scaner.enterNewDataCounterColdWaterInBathroom())
//                .newCounterHotWaterInKitchen(scaner.enterNewDataCounterHotWaterInKitchen())
//                .newCounterColdWaterInKitchen(scaner.enterNewDataCounterColdWaterInKitchen())
//                .newEnergyCounter(scaner.enterNewDataEnergyCounter())
                .build();
    }
}
