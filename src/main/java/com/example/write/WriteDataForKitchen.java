package com.example.write;

import com.example.model.LastData;
import com.example.model.DataProcessing;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.example.constants.ConstForCell.*;
import static com.example.constants.ConstForFileFolder.FILE_FOLDER;

public class WriteDataForKitchen
{
    public WriteDataForKitchen writeLastDataHotWaterCounterInKitchen(LastData lastData) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(LAST_NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN);
        dataCell.setCellValue(lastData.getLastCounterHotWaterInKitchen());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writeNewDataHotWaterCounterInKitchen(LastData lastData) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN);
        dataCell.setCellValue(lastData.getNewCounterHotWaterInKitchen());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writePriceForHotWaterInKitchen(LastData lastData, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_PRICE_FOR_HOT_WATER_IN_KITCHEN);
        dataCell.setCellValue(dataProcessing.priceHotWaterInKitchen(lastData));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writeLastDataColdWaterCounterInKitchen(LastData lastData) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(LAST_NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN);
        dataCell.setCellValue(lastData.getLastCounterColdWaterInKitchen());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writeNewDataColdWaterCounterInKitchen(LastData lastData) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN);
        dataCell.setCellValue(lastData.getNewCounterColdWaterInKitchen());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writePriceForColdWaterInKitchen(LastData lastData, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_PRICE_FOR_COLD_WATER_IN_KITCHEN);
        dataCell.setCellValue(dataProcessing.priceColdWaterInKitchen(lastData));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }
}