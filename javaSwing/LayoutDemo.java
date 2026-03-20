//Layout Manager
package javaSwing;

import javax.swing.*;
import java.awt.*;

public class LayoutDemo 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Layout Manager Demo");

        frame.setLayout(new FlowLayout());

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));

        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}