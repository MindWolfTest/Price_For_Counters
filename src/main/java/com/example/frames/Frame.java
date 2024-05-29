package com.example.frames;

import javax.swing.*;
import java.awt.*;

public class Frame
{
    public static JFrame getFrame()
    {
        JFrame jFrame = new JFrame("Показания счетчиков");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        return jFrame;
    }
}
