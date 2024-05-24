package com.example.write;

import com.example.model.LastData;
import com.example.model.DataProcessing;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

import static com.example.constants.ConstForCell.*;
import static com.example.constants.ConstForFileFolder.FILE_FOLDER;

public class WriteDataForBathroom
{

    public WriteDataForBathroom writeLastDataHotWaterCounterInBathroom(LastData lastData) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(LAST_NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM);
        dataCell.setCellValue(lastData.getLastCounterHotWaterInBathroom());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writeNewDataHotWaterCounterInBathroom(LastData lastData) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM);
        dataCell.setCellValue(lastData.getNewCounterHotWaterInBathroom());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writePriceForHotWaterInBathroom(LastData lastData, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_PRICE_FOR_HOT_WATER_IN_BATHROOM);
        dataCell.setCellValue(dataProcessing.priceHotWaterInBathroom(lastData));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writeLastDataColdWaterCounterInBathroom(LastData lastData) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(LAST_NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM);
        dataCell.setCellValue(lastData.getLastCounterColdWaterInBathroom());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writeNewDataColdWaterCounterInBathroom(LastData lastData) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM);
        dataCell.setCellValue(lastData.getNewCounterColdWaterInBathroom());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writePriceForColdWaterInBathroom(LastData lastData, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(lastData.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_PRICE_FOR_COLD_WATER_IN_BATHROOM);
        dataCell.setCellValue(dataProcessing.priceColdWaterInBathroom(lastData));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }
}
