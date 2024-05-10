package com.example;

import com.example.model.DataProcessing;
import com.example.model.ReadDataFromFile;
import com.example.model.WriteDataToFile;

import java.io.IOException;
import java.util.Scanner;

import static com.example.constants.ConstForCell.*;
import static com.example.constants.ConstForTax.*;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи год:\t");
        int year = scanner.nextInt();

        System.out.print("\nВведи месяц:\t");
        String month = scanner.next();

        System.out.print("\nВведи показания счетчика за горячую воду в ванной:\t");
        double newCounterHotWaterInBathroom = scanner.nextDouble();
        System.out.print("\nВведи показания счетчика за холодную воду в ванной:\t");
        double newCounterColdWaterInBathroom = scanner.nextDouble();
        System.out.print("\nВведи показания счетчика за горячую воду на кухне:\t");
        double newCounterHotWaterInKitchen = scanner.nextDouble();
        System.out.print("\nВведи показания счетчика за холодную воду на кухне:\t");
        double newCounterColdWaterInKitchen = scanner.nextDouble();
        System.out.print("\nВведи показания счетчика за электричество:\t");
        double newEnergyCounter = scanner.nextDouble();

        ReadDataFromFile readDataFromFile = new ReadDataFromFile();

        int lastRow = readDataFromFile.getNumberOfLastRow();
        int newRow = readDataFromFile.getNumberOfNewRow();

        double lastDataFromCounterHotWaterInTheBathroom =
                readDataFromFile.getDataFromCell(lastRow, NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM);
        double lastDataFromCounterColdWaterInTheBathroom =
                readDataFromFile.getDataFromCell(lastRow, NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM);
        double lastDataFromCounterHotWaterInTheKitchen =
                readDataFromFile.getDataFromCell(lastRow, NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN);
        double lastDataFromCounterColdWaterInTheKitchen =
                readDataFromFile.getDataFromCell(lastRow, NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN);
        double lastDataFromEnergyCounter = readDataFromFile.getDataFromCell(lastRow, NUMBER_OF_CELL_COUNTER_ENERGY);

        DataProcessing dataProcessing = new DataProcessing();

        double priceForHotWaterInBathroom = dataProcessing
                .price(lastDataFromCounterHotWaterInTheBathroom, newCounterHotWaterInBathroom, TAX_FOR_HOT_WATER);
        double usedHotWaterInBathroom = dataProcessing
                .usedWater(lastDataFromCounterHotWaterInTheBathroom, newCounterHotWaterInBathroom);

        double priceForColdWaterInBathroom = dataProcessing
                .price(lastDataFromCounterColdWaterInTheBathroom, newCounterColdWaterInBathroom, TAX_FOR_COLD_WATER);
        double usedColdWaterInBathroom = dataProcessing
                .usedWater(lastDataFromCounterColdWaterInTheBathroom, newCounterColdWaterInBathroom);

        double priceForHotWaterInKitchen = dataProcessing
                .price(lastDataFromCounterHotWaterInTheKitchen, newCounterHotWaterInKitchen, TAX_FOR_HOT_WATER);
        double usedHotWaterInKitchen = dataProcessing
                .usedWater(lastDataFromCounterHotWaterInTheKitchen, newCounterHotWaterInKitchen);

        double priceForColdWaterInKitchen = dataProcessing
                .price(lastDataFromCounterColdWaterInTheKitchen, newCounterColdWaterInKitchen, TAX_FOR_COLD_WATER);
        double usedColdWaterInKitchen = dataProcessing
                .usedWater(lastDataFromCounterColdWaterInTheKitchen, newCounterColdWaterInKitchen);

        double priceForEnergy = dataProcessing
                .price(lastDataFromEnergyCounter, newEnergyCounter, TAX_FOR_ENERGY);

        double usedWaterDrainage = dataProcessing
                .usedWaterDrainage(usedHotWaterInBathroom, usedColdWaterInBathroom,
                        usedHotWaterInKitchen, usedColdWaterInKitchen);
        double priceWaterDrainage = dataProcessing
                .priceForWaterDrainage(usedHotWaterInBathroom, usedColdWaterInBathroom,
                        usedHotWaterInKitchen, usedColdWaterInKitchen, TAX_FOR_WATER_DRAINAGE);

        double priceForAllCounters = dataProcessing
                .fullPriceForAllCounters(priceForHotWaterInBathroom, priceForColdWaterInBathroom,
                        priceForHotWaterInKitchen, priceForColdWaterInKitchen, priceWaterDrainage, priceForEnergy);


        WriteDataToFile writeDataToCellYear = new WriteDataToFile();
        writeDataToCellYear
                .firstDataWriting(newRow, NUMBER_OF_CELL_YEAR, year);

        WriteDataToFile writeDataToCellMonth = new WriteDataToFile();
        writeDataToCellMonth
                .writeStringToCell(newRow, NUMBER_OF_CELL_MONTH, month)

                .writeDataToCell(newRow, LAST_NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM,
                        lastDataFromCounterHotWaterInTheBathroom)
                .writeDataToCell(newRow, NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM,
                        newCounterHotWaterInBathroom)
                .writeDataToCell(newRow, NUMBER_OF_CELL_PRICE_FOR_HOT_WATER_IN_BATHROOM,
                        priceForHotWaterInBathroom)

                .writeDataToCell(newRow, LAST_NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM,
                        lastDataFromCounterColdWaterInTheBathroom)
                .writeDataToCell(newRow, NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM,
                        newCounterColdWaterInBathroom)
                .writeDataToCell(newRow, NUMBER_OF_CELL_PRICE_FOR_COLD_WATER_IN_BATHROOM,
                        priceForColdWaterInBathroom)

                .writeDataToCell(newRow, LAST_NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN,
                        lastDataFromCounterHotWaterInTheKitchen)
                .writeDataToCell(newRow, NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN,
                        newCounterHotWaterInKitchen)
                .writeDataToCell(newRow, NUMBER_OF_CELL_PRICE_FOR_HOT_WATER_IN_KITCHEN, priceForHotWaterInKitchen)

                .writeDataToCell(newRow, LAST_NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN,
                        lastDataFromCounterColdWaterInTheKitchen)
                .writeDataToCell(newRow, NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN, newCounterColdWaterInKitchen)
                .writeDataToCell(newRow, NUMBER_OF_CELL_PRICE_FOR_COLD_WATER_IN_KITCHEN, priceForColdWaterInKitchen)

                .writeDataToCell(newRow, LAST_NUMBER_OF_CELL_COUNTER_ENERGY, lastDataFromEnergyCounter)
                .writeDataToCell(newRow,NUMBER_OF_CELL_COUNTER_ENERGY, newEnergyCounter)
                .writeDataToCell(newRow, NUMBER_OF_CELL_PRICE_FOR_ENERGY, priceForEnergy)

                .writeDataToCell(newRow, NUMBER_OF_CELL_WATER_DRAINAGE, usedWaterDrainage)
                .writeDataToCell(newRow,NUMBER_OF_CELL_PRICE_FOR_WATER_DRAINAGE, priceWaterDrainage)

                .writeDataToCell(newRow, NUMBER_OF_CELL_FULL_PRICE, priceForAllCounters);
        System.out.print("\nОбщая стоимость:\t" + priceForAllCounters);
    }
}