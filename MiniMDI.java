//javaSwing
import javax.swing.*;
public class MiniMDI {
	
	    public static void main(String[] args) {
	        JFrame f = new JFrame("MDI");
	        f.setSize(500, 350);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        JDesktopPane d = new JDesktopPane();
	        f.add(d);
	        
	        JInternalFrame i1 = new JInternalFrame("Window 1", true, true, true, true);
	        i1.setBounds(50, 50, 200, 150);
	        i1.add(new JLabel("Content 1"));
	        i1.setVisible(true);
	        d.add(i1);
	        
	        JInternalFrame i2 = new JInternalFrame("Window 2", true, true, true, true);
	        i2.setBounds(100, 100, 200, 150);
	        i2.add(new JLabel("Content 2"));
	        i2.setVisible(true);
	        d.add(i2);
	        
	        f.setVisible(true);
	    }
	}
