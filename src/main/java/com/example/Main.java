package com.example;

import com.example.model.LastData;
import com.example.model.NewData;
import com.example.model.RowNumber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static com.example.edit.AddNewData.createNewData;
import static com.example.edit.EditRow.createRowNumbers;
import static com.example.edit.GetLastData.createLastData;
import static com.example.frames.Frame.getFrame;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton createData = new JButton("Заполнить таблицу");
        jPanel.add(createData);
        createData.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                WriteData writeData =new WriteData();
                try
                {
                    RowNumber rowNumber = createRowNumbers();
                    LastData lastData = createLastData(rowNumber);
                    NewData newData = createNewData();
                    writeData.writeData(lastData, newData, rowNumber);
                } catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}