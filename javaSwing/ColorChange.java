package javaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChange extends JFrame implements ActionListener 
{
    JButton red, green, blue;

    ColorChange()
    {
        setLayout(new FlowLayout());

        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");

        add(red); add(green); add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == red)
        {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == green)
        {
            getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == blue) 
        {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args)
    {
        new ColorChange();
    }
}