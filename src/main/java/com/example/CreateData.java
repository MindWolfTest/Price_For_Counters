package com.example;

import com.example.model.LastData;

import java.io.IOException;

import static com.example.edit.GetLastData.createLastData;

public class CreateData
{
    public CreateData editData() throws IOException
    {
        LastData lastData = createLastData();
        return this;
    }
}
