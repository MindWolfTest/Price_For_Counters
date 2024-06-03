package com.example;

import com.example.model.DataProcessing;
import com.example.model.LastData;
import com.example.model.NewData;
import com.example.model.RowNumber;
import com.example.write.*;

import java.io.IOException;

public class WriteData
{
    public WriteData writeData(LastData lastData, NewData newData, RowNumber rowNumber) throws IOException
    {
        DataProcessing dataProcessing =new DataProcessing();

        WriteYearMonth writeYearMonth = new WriteYearMonth();
        writeYearMonth
                .yearWritingToFile(newData, rowNumber)
                .writeMonthToCell(newData, rowNumber);

        WriteTotalPrice writeTotalPrice = new WriteTotalPrice();
        writeTotalPrice
                .writeTotalPrice(lastData, newData, rowNumber, dataProcessing);

        WriteDataForBathroom writeDataForBathroom = new WriteDataForBathroom();
        writeDataForBathroom
                .writeLastDataHotWaterCounterInBathroom(lastData, rowNumber)
                .writeNewDataHotWaterCounterInBathroom(newData, rowNumber)
                .writePriceForHotWaterInBathroom(lastData, newData, rowNumber, dataProcessing)
                .writeLastDataColdWaterCounterInBathroom(lastData, rowNumber)
                .writeNewDataColdWaterCounterInBathroom(newData, rowNumber)
                .writePriceForColdWaterInBathroom(lastData, newData, rowNumber, dataProcessing);

        WriteDataForKitchen writeDataForKitchen = new WriteDataForKitchen();
        writeDataForKitchen
                .writeLastDataHotWaterCounterInKitchen(lastData, rowNumber)
                .writeNewDataHotWaterCounterInKitchen(newData, rowNumber)
                .writePriceForHotWaterInKitchen(lastData, newData, rowNumber, dataProcessing)
                .writeLastDataColdWaterCounterInKitchen(lastData, rowNumber)
                .writeNewDataColdWaterCounterInKitchen(newData, rowNumber)
                .writePriceForColdWaterInKitchen(lastData, newData, rowNumber, dataProcessing);

        WriteDataForWaterDrainage writeDataForWaterDrainage = new WriteDataForWaterDrainage();
        writeDataForWaterDrainage
                .writeUsedWaterCounter(lastData, newData, rowNumber, dataProcessing)
                .writePriceForWaterDrainage(lastData, newData, rowNumber, dataProcessing);

        WriteDataForEnergy writeDataForEnergy = new WriteDataForEnergy();
        writeDataForEnergy
                .writeLastDataEnergyCounter(lastData, rowNumber)
                .writeNewDataEnergyCounter(newData, rowNumber)
                .writePriceForEnergy(lastData, newData, rowNumber, dataProcessing);
        return this;
    }
}
