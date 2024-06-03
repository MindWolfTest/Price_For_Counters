package com.example.read;

import com.example.model.RowNumber;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

import static com.example.constants.ConstForCell.NUMBER_OF_SHEET;
import static com.example.constants.ConstForFileFolder.FILE_FOLDER;

public class ReadDataFromFile
{
    public int getNumberOfLastRow() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        int lastRow = wb.getSheetAt(NUMBER_OF_SHEET).getLastRowNum();

        fileInputStream.close();
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

    public double getDataFromCellLastCounter(int cellNum, RowNumber rowNumber) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        double lastDataFromCounter = 0;
        try
        {
            lastDataFromCounter = wb.getSheetAt(NUMBER_OF_SHEET)
                    .getRow(rowNumber.getLastRow())
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
}
