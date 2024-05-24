package com.example;

import com.example.model.LastData;
import com.example.model.DataProcessing;
import com.example.write.*;

import java.io.IOException;

public class WriteData
{
    public WriteData writeData(LastData lastData) throws IOException
    {
        DataProcessing dataProcessing =new DataProcessing();

        WriteYearMonth writeYearMonth = new WriteYearMonth();
        writeYearMonth
                .yearWritingToFile(lastData)
                .writeMonthToCell(lastData);

        WriteTotalPrice writeTotalPrice = new WriteTotalPrice();
        writeTotalPrice
                .writeTotalPrice(lastData, dataProcessing);

        WriteDataForBathroom writeDataForBathroom = new WriteDataForBathroom();
        writeDataForBathroom
                .writeLastDataHotWaterCounterInBathroom(lastData)
                .writeNewDataHotWaterCounterInBathroom(lastData)
                .writePriceForHotWaterInBathroom(lastData, dataProcessing)
                .writeLastDataColdWaterCounterInBathroom(lastData)
                .writeNewDataColdWaterCounterInBathroom(lastData)
                .writePriceForColdWaterInBathroom(lastData, dataProcessing);

        WriteDataForKitchen writeDataForKitchen = new WriteDataForKitchen();
        writeDataForKitchen
                .writeLastDataHotWaterCounterInKitchen(lastData)
                .writeNewDataHotWaterCounterInKitchen(lastData)
                .writePriceForHotWaterInKitchen(lastData, dataProcessing)
                .writeLastDataColdWaterCounterInKitchen(lastData)
                .writeNewDataColdWaterCounterInKitchen(lastData)
                .writePriceForColdWaterInKitchen(lastData, dataProcessing);

        WriteDataForWaterDrainage writeDataForWaterDrainage = new WriteDataForWaterDrainage();
        writeDataForWaterDrainage
                .writeUsedWaterCounter(lastData, dataProcessing)
                .writePriceForWaterDrainage(lastData, dataProcessing);

        WriteDataForEnergy writeDataForEnergy = new WriteDataForEnergy();
        writeDataForEnergy
                .writeLastDataEnergyCounter(lastData)
                .writeNewDataEnergyCounter(lastData)
                .writePriceForEnergy(lastData, dataProcessing);
        return this;
    }
}
