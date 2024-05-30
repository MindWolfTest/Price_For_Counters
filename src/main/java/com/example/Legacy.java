package com.example;

import com.example.model.DataProcessing;
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

public class Legacy extends JDialog
{
    private JPanel contentPane;
    private JLabel month;
    private JLabel year;
    private JTextField addYear;
    private JTextField addMonth;
    private JTextField addNewDataHotWaterInBathroom;
    private JTextField addNewDataColdWaterInBathroom;
    private JTextField addNewDataHotWaterInKitchen;
    private JTextField addNewDataColdWaterInKitchen;
    private JTextField addNewEnergyData;
    private JButton addDataToFile;
    private JButton buttonOK;

    public Legacy()
    {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        addDataToFile.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                WriteData writeData = new WriteData();

                try
                {
                    RowNumber rowNumber = createRowNumbers();
                    LastData lastData = createLastData(rowNumber);

                    try
                    {
                        int year = Integer.parseInt(addYear.getText());
                        String month = addMonth.getText();
                        double newDataCounterHotWaterInBathroom = Double.parseDouble(addNewDataHotWaterInBathroom.getText());
                        double newDataCounterColdWaterInBathroom = Double.parseDouble(addNewDataColdWaterInBathroom.getText());
                        double newDataCounterHotWaterInKitchen = Double.parseDouble(addNewDataHotWaterInKitchen.getText());
                        double newDataCounterColdWaterInKitchen = Double.parseDouble(addNewDataColdWaterInKitchen.getText());
                        double newDataEnergyCounter = Double.parseDouble(addNewEnergyData.getText());

                        NewData newData = createNewData(year, month, newDataCounterHotWaterInBathroom, newDataCounterColdWaterInBathroom,
                                newDataCounterHotWaterInKitchen, newDataCounterColdWaterInKitchen, newDataEnergyCounter);
                        writeData.writeData(lastData, newData, rowNumber);

                        DataProcessing dataProcessing = new DataProcessing();
                        JOptionPane.showMessageDialog(null, "Данные за '" + month + "' '" + year + "' года записаны!" +
                                "\nИтоговая стоимость:  '" + dataProcessing.totalPrice(lastData, newData) + "' руб.");
                        addMonth.setText(null);
                        addNewDataHotWaterInBathroom.setText(null);
                        addNewDataColdWaterInBathroom.setText(null);
                        addNewDataHotWaterInKitchen.setText(null);
                        addNewDataColdWaterInKitchen.setText(null);
                        addNewEnergyData.setText(null);
                    }
                    catch (Exception emptyFields)
                    {
                        JOptionPane.showMessageDialog(null,"Что-то пошло не так");
                    }
                }
                catch (IOException ex)
                {
                    JOptionPane.showMessageDialog(null,"Файл не найден или занят");
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame jFrame = getFrame();
        jFrame.setContentPane(new Legacy().contentPane);

        jFrame.revalidate();
    }
}