package com.example.write;

import com.example.model.LastData;
import com.example.model.DataProcessing;
import com.example.model.NewData;
import com.example.model.RowNumber;
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

    public WriteDataForBathroom writeLastDataHotWaterCounterInBathroom(LastData lastData, RowNumber rowNumber) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(LAST_NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM);
        dataCell.setCellValue(lastData.getLastCounterHotWaterInBathroom());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writeNewDataHotWaterCounterInBathroom(NewData newData, RowNumber rowNumber) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM);
        dataCell.setCellValue(newData.getNewCounterHotWaterInBathroom());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writePriceForHotWaterInBathroom(LastData lastData, NewData newData, RowNumber rowNumber, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_PRICE_FOR_HOT_WATER_IN_BATHROOM);
        dataCell.setCellValue(dataProcessing.priceHotWaterInBathroom(lastData, newData));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writeLastDataColdWaterCounterInBathroom(LastData lastData, RowNumber rowNumber) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(LAST_NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM);
        dataCell.setCellValue(lastData.getLastCounterColdWaterInBathroom());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writeNewDataColdWaterCounterInBathroom(NewData newData, RowNumber rowNumber) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_COUNTER_COLD_WATER_IN_BATHROOM);
        dataCell.setCellValue(newData.getNewCounterColdWaterInBathroom());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForBathroom writePriceForColdWaterInBathroom(LastData lastData, NewData newData, RowNumber rowNumber, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_PRICE_FOR_COLD_WATER_IN_BATHROOM);
        dataCell.setCellValue(dataProcessing.priceColdWaterInBathroom(lastData, newData));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }
}
