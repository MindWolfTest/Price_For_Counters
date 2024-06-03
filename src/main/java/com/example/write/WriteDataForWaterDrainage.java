package com.example.write;

import com.example.model.DataProcessing;
import com.example.model.LastData;
import com.example.model.NewData;
import com.example.model.RowNumber;
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

public class WriteDataForWaterDrainage
{
    public WriteDataForWaterDrainage writeUsedWaterCounter(LastData lastData, NewData newData, RowNumber rowNumber, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_WATER_DRAINAGE);
        dataCell.setCellValue(dataProcessing.usedWaterCounter(lastData, newData));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataForWaterDrainage writePriceForWaterDrainage(LastData lastData, NewData newData, RowNumber rowNumber, DataProcessing dataProcessing) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_PRICE_FOR_WATER_DRAINAGE);
        dataCell.setCellValue(dataProcessing.priceForWaterDrainage(lastData, newData));

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }
}
