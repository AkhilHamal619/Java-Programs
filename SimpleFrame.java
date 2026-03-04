//java Swing
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleFrame {

	 public static void main(String[] args) {
	        JFrame f = new JFrame("Simple JFrame");
	        f.setSize(400, 300);
	        f.add(new JLabel("This works in STS!"));
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setVisible(true);
	    }
}