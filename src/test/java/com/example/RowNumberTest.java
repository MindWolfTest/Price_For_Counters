package com.example;

import com.example.model.RowNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RowNumberTest
{
    RowNumber rowNumber = new RowNumber();

    @Test
    public void setGetLastRowTest()
    {
        rowNumber.setLastRow(24);

        int actualResult = rowNumber.getLastRow();
        int expectedResult = 24;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }

    @Test
    public void setGetNewRowTest()
    {
        rowNumber.setNewRow(12);

        int actualResult = rowNumber.getNewRow();
        int expectedResult = 12;

        assertEquals("\nОшибка!\nрезультат не корректный", expectedResult, actualResult);
    }
}
