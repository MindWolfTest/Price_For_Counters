package com.example.model;

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
        return getNumberOfLastRow()+1;
    }

    public double getDataFromCell(int lastRow, int numberOfCell) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        double lastDataFromCounter = wb.getSheetAt(NUMBER_OF_SHEET)
                .getRow(lastRow)
                .getCell(numberOfCell)
                .getNumericCellValue();

        fileInputStream.close();
        return lastDataFromCounter;
    }
}
