//Life Cycle of Java Applet
import java.applet.*;
import java.awt.*;

public class LifeCycleofJavaApplet extends Applet 
{

    public void init() 
    {
        setBackground(Color.yellow);
        setFont(new Font("Arial", Font.BOLD, 30));
        Label lab1 = new Label("Lifecycle Applet");
        add(lab1);
        System.out.println("Init called");
    }

    public void start() 
    {
        System.out.println("Start called");
    }

    public void paint(Graphics g) 
    {
        g.drawString("Applet is Running", 50, 100);
        System.out.println("Paint called");
    }
    public void stop() 
    {
        System.out.println("Stop called");
    }

    public void destroy()
    {
        System.out.println("destroy called");
    }
}