package com.example.frames;

import javax.swing.*;
import java.awt.*;

public class Frame
{
    public static JFrame getFrame()
    {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 400, dimension.height/2 - 300, 800, 600);
        return jFrame;
    }
}
