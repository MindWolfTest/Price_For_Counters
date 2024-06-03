package com.example.write;

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

public class WriteYearMonth
{
    public WriteYearMonth yearWritingToFile(NewData newData, RowNumber rowNumber) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.createRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_YEAR);
        dataCell.setCellValue(newData.getYear());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteYearMonth writeMonthToCell(NewData newData, RowNumber rowNumber) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(rowNumber.getNewRow());
        Cell dataCell = row.createCell(NUMBER_OF_CELL_MONTH);
        dataCell.setCellValue(newData.getMonth());

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(FILE_FOLDER);
        wb.write(fos);
        fos.close();
        return this;
    }
}
