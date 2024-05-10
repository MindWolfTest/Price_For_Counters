package com.example.model;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

import static com.example.constants.ConstForCell.NUMBER_OF_SHEET;
import static com.example.constants.ConstForFileFolder.FILE_FOLDER;

public class WriteDataToFile
{


    public WriteDataToFile firstDataWriting(int newRow, int cellForData, double value) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.createRow(newRow);
        Cell dataCell = row.createCell(cellForData);
        dataCell.setCellValue(value);

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(new File(FILE_FOLDER));
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataToFile writeStringToCell(int newRow, int cellForData, String value) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(newRow);
        Cell dataCell = row.createCell(cellForData);
        dataCell.setCellValue(value);

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(new File(FILE_FOLDER));
        wb.write(fos);
        fos.close();
        return this;
    }

    public WriteDataToFile writeDataToCell(int newRow, int cellForData, double value) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(NUMBER_OF_SHEET);
        Row row = sheet.getRow(newRow);
        Cell dataCell = row.createCell(cellForData);
        dataCell.setCellValue(value);

        fileInputStream.close();

        FileOutputStream fos = new FileOutputStream(new File(FILE_FOLDER));
        wb.write(fos);
        fos.close();
        return this;
    }
}
