package com.example;

import com.example.model.LastData;
import com.example.model.RowNumber;

import java.io.IOException;

import static com.example.edit.GetLastData.createLastData;

public class CreateData
{
    public CreateData editData(RowNumber rowNumber) throws IOException
    {
        LastData lastData = createLastData(rowNumber);
        return this;
    }
}
