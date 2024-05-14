package com.example.write;

import com.example.model.Data;
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
    public WriteDataForKitchen writeLastDataHotWaterCounterInKitchen(Data data) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(data.getNewRow());
        Cell dataCell = row.createCell(LAST_NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN);
        dataCell.setCellValue(data.getLastCounterHotWaterInKitchen());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writeNewDataHotWaterCounterInKitchen(Data data) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(data.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_KITCHEN);
        dataCell.setCellValue(data.getNewCounterHotWaterInKitchen());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writePriceForHotWaterInKitchen(Data data, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(data.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_PRICE_FOR_HOT_WATER_IN_KITCHEN);
        dataCell.setCellValue(dataProcessing.priceHotWaterInKitchen(data));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writeLastDataColdWaterCounterInKitchen(Data data) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(data.getNewRow());
        Cell dataCell = row.createCell(LAST_NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN);
        dataCell.setCellValue(data.getLastCounterColdWaterInKitchen());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writeNewDataColdWaterCounterInKitchen(Data data) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(data.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_KITCHEN);
        dataCell.setCellValue(data.getNewCounterColdWaterInKitchen());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForKitchen writePriceForColdWaterInKitchen(Data data, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(data.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_PRICE_FOR_COLD_WATER_IN_KITCHEN);
        dataCell.setCellValue(dataProcessing.priceColdWaterInKitchen(data));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }
}
