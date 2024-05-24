package com.example.edit;


import com.example.model.RowNumber;

import java.io.IOException;

import static com.example.edit.GetLastData.readDataFromFile;

public class EditRow
{
    public static RowNumber createRowNumbers() throws IOException
    {
        return RowNumber.builder()
                .lastRow(readDataFromFile.getNumberOfLastRow())
                .newRow(readDataFromFile.getNumberOfNewRow())
                .build();
    }
}
