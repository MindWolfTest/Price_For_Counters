package com.example.model;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.example.constants.ConstForCell.LAST_NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM;
import static com.example.constants.ConstForCell.NUMBER_OF_SHEET;
import static com.example.constants.ConstForFileFolder.FILE_FOLDER;
import static org.apache.poi.xslf.usermodel.XSLFTableStyle.TablePartStyle.lastRow;

public class ReadDataFromFile
{
    Data data =new Data();
    public ReadDataFromFile getNumberOfLastRow() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        int lastRow = wb.getSheetAt(NUMBER_OF_SHEET).getLastRowNum();
        data.setLastRow(lastRow);

        fileInputStream.close();
        //System.out.println(data.getLastRow());
        return this;
    }

    public ReadDataFromFile getNumberOfNewRow() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
        Workbook wb = new XSSFWorkbook(fileInputStream);
        int newRow = wb.getSheetAt(NUMBER_OF_SHEET).getLastRowNum() + 1;
        data.setNewRow(newRow);

        fileInputStream.close();
        //System.out.println(data.getNewRow());
        return this;
    }

    public double getDataFromCell(Data data)
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream(FILE_FOLDER);
            Workbook wb = new XSSFWorkbook(fileInputStream);
            double lastDataFromCounter = wb.getSheetAt(NUMBER_OF_SHEET)
                    .getRow(data.getLastRow())
                    .getCell(LAST_NUMBER_OF_CELL_COUNTER_HOT_WATER_IN_BATHROOM)
                    .getNumericCellValue();
            data.setLastCounterHotWaterInTheBathroom(lastDataFromCounter);

            fileInputStream.close();
            return lastDataFromCounter;
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }


    }
}
