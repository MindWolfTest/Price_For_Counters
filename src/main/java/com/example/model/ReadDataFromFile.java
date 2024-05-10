package com.example.model;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

import static com.example.constants.ConstForCell.*;
import static com.example.constants.ConstForFileFolder.FILE_FOLDER;

public class ReadDataFromFile
{

    Data dataRow =new Data();
    public int getNumberOfLastRow() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        int lastRow = wb.getSheetAt(NUMBER_OF_SHEET).getLastRowNum();
        dataRow.setLastRow(lastRow);

        fileInputStream.close();
        //System.out.println(data.getLastRow());
        return lastRow;
    }

    public int getNumberOfNewRow() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        int newRow = wb.getSheetAt(NUMBER_OF_SHEET).getLastRowNum() + 1;

        fileInputStream.close();

        return newRow;
    }

    public double getDataFromCellLastCounter(int cellNum) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        double lastDataFromCounter = 0;
        try
        {
            lastDataFromCounter = wb.getSheetAt(NUMBER_OF_SHEET)
                    .getRow(dataRow.getLastRow())
                    .getCell(cellNum)
                    .getNumericCellValue();

            fileInputStream.close();

        }

        catch (Exception e)
        {
            fileInputStream.close();

        }
        return lastDataFromCounter;
    }

    public double getDataFromCellLastCounterHotWaterInBathroom() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        double lastDataFromCounter = 0;
        try
        {
            lastDataFromCounter = wb.getSheetAt(NUMBER_OF_SHEET)
                    .getRow(dataRow.getLastRow())
                    .getCell(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM)
                    .getNumericCellValue();

            fileInputStream.close();

        }

        catch (Exception e)
        {
            fileInputStream.close();

        }
        return lastDataFromCounter;
    }

    public double getDataFromCellLastCounterColdWaterInBathroom() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        double lastDataFromCounter = 0;
        try
        {
            lastDataFromCounter = wb.getSheetAt(NUMBER_OF_SHEET)
                    .getRow(dataRow.getLastRow())
                    .getCell(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM)
                    .getNumericCellValue();

            fileInputStream.close();
            
        }

        catch (Exception e)
        {
            fileInputStream.close();            
        }
        return lastDataFromCounter;
    }

    public double getDataFromCellLastCounterHotWaterInKitchen() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        double lastDataFromCounter = 0;
        try
        {
            lastDataFromCounter = wb.getSheetAt(NUMBER_OF_SHEET)
                    .getRow(dataRow.getLastRow())
                    .getCell(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN)
                    .getNumericCellValue();

            fileInputStream.close();

        }

        catch (Exception e)
        {
            fileInputStream.close();
        }
        return lastDataFromCounter;
    }

    public double getDataFromCellLastCounterColdWaterInKitchen() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        double lastDataFromCounter = 0;
        try
        {
            lastDataFromCounter = wb.getSheetAt(NUMBER_OF_SHEET)
                    .getRow(dataRow.getLastRow())
                    .getCell(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN)
                    .getNumericCellValue();

            fileInputStream.close();

        }

        catch (Exception e)
        {
            fileInputStream.close();
        }
        return lastDataFromCounter;
    }

    public double getDataFromCellLastEnergyCounter() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        double lastDataFromCounter = 0;
        try
        {
            lastDataFromCounter = wb.getSheetAt(NUMBER_OF_SHEET)
                    .getRow(dataRow.getLastRow())
                    .getCell(NUMBER_OF_CELL_COUNTER_ENERGY)
                    .getNumericCellValue();

            fileInputStream.close();

        }

        catch (Exception e)
        {
            fileInputStream.close();
        }
        return lastDataFromCounter;
    }
}
