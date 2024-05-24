package com.example;

import com.example.model.LastData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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
                    LastData lastData = createLastData();;
                    writeData.writeData(lastData);
                } catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}