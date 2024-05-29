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
    public static void main(String[] args)
    {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();

        jFrame.add(jPanel);


        JTextField jYear = new JTextField(4);
        jPanel.add(jYear);

        JTextField jMonth = new JTextField(8);
        jPanel.add(jMonth);

        JTextField jNewCounterHotWaterInBathroom = new JTextField(8);
        jPanel.add(jNewCounterHotWaterInBathroom);

        JTextField jNewCounterColdWaterInBathroom = new JTextField(8);
        jPanel.add(jNewCounterColdWaterInBathroom);

        JTextField jNewCounterHotWaterInKitchen = new JTextField(8);
        jPanel.add(jNewCounterHotWaterInKitchen);

        JTextField jNewCounterColdWaterInKitchen = new JTextField(8);
        jPanel.add(jNewCounterColdWaterInKitchen);

        JTextField jEnergyCounter = new JTextField(8);
        jPanel.add(jEnergyCounter);




        JButton createData = new JButton("Заполнить таблицу");
        jPanel.add(createData);
        jPanel.revalidate();
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

                    int year = Integer.parseInt(jYear.getText());
                    String month = jMonth.getText();
                    double newDataCounterHotWaterInBathroom = Double.parseDouble(jNewCounterHotWaterInBathroom.getText());
                    double newDataCounterColdWaterInBathroom = Double.parseDouble(jNewCounterColdWaterInBathroom.getText());
                    double newDataCounterHotWaterInKitchen = Double.parseDouble(jNewCounterHotWaterInKitchen.getText());
                    double newDataCounterColdWaterInKitchen = Double.parseDouble(jNewCounterColdWaterInKitchen.getText());
                    double newDataEnergyCounter = Double.parseDouble(jEnergyCounter.getText());

                    NewData newData = createNewData(year, month, newDataCounterHotWaterInBathroom, newDataCounterColdWaterInBathroom,
                            newDataCounterHotWaterInKitchen, newDataCounterColdWaterInKitchen, newDataEnergyCounter);

                    writeData.writeData(lastData, newData, rowNumber);
                } catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
            }
        });

    }
}