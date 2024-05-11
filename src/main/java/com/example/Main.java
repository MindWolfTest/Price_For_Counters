package com.example;

import com.example.model.Data;
import com.example.model.DataProcessing;
import com.example.write.*;

import java.io.IOException;

import static com.example.edit.EditData.createData;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        Data data = createData();

        DataProcessing dataProcessing =new DataProcessing();

        WriteYearMonth writeYearMonth = new WriteYearMonth();

        writeYearMonth
                .yearWritingToFile(data)
                .writeMonthToCell(data);

        WriteTotalPrice writeTotalPrice = new WriteTotalPrice();
        writeTotalPrice
                .writeTotalPrice(data, dataProcessing);

        WriteDataForBathroom writeDataForBathroom = new WriteDataForBathroom();
        writeDataForBathroom
                .writeLastDataHotWaterCounterInBathroom(data)
                .writeNewDataHotWaterCounterInBathroom(data)
                .writePriceForHotWaterInBathroom(data, dataProcessing)
                .writeLastDataColdWaterCounterInBathroom(data)
                .writeNewDataColdWaterCounterInBathroom(data)
                .writePriceForColdWaterInBathroom(data, dataProcessing);

        WriteDataForKitchen writeDataForKitchen = new WriteDataForKitchen();
        writeDataForKitchen
                .writeLastDataHotWaterCounterInKitchen(data)
                .writeNewDataHotWaterCounterInKitchen(data)
                .writePriceForHotWaterInKitchen(data, dataProcessing)
                .writeLastDataColdWaterCounterInKitchen(data)
                .writeNewDataColdWaterCounterInKitchen(data)
                .writePriceForColdWaterInKitchen(data, dataProcessing);

        WriteDataForWaterDrainage writeDataForWaterDrainage = new WriteDataForWaterDrainage();
        writeDataForWaterDrainage
                .writeUsedWaterCounter(data, dataProcessing)
                .writePriceForWaterDrainage(data, dataProcessing);

        WriteDataForEnergy writeDataForEnergy = new WriteDataForEnergy();
        writeDataForEnergy
                .writeLastDataEnergyCounter(data)
                .writeNewDataEnergyCounter(data)
                .writePriceForEnergy(data, dataProcessing);
        System.out.println("Итоговая стоимость:\t" + dataProcessing.totalPrice(data));
    }
}