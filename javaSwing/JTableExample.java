package javaSwing;

import javax.swing.*;

public class JTableExample
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JTable Example");

        String data[][] =
        {
            {"1", "Prakash", "CS"},
            {"2", "Mahesh", "IT"},
            {"3", "Akhil", "CA"}
        };

        String column[] = {"ID", "Name", "Department"};

        JTable table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(table);

        frame.add(sp);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}