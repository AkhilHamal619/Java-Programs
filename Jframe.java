import javax.swing.JFrame;

public class Jframe
{  // Class name should not conflict with JFrame class
    public static void main(String[] args) 
    {
        JFrame window = new JFrame("My Application");
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Important!
        window.setVisible(true);
    }
}