// Fig 12.6 LabelFrame.java pp 473-474 - AO
// Credit to Cordell for assistance in creating JLabels 
// Credit to Delanie for assistance in creating methods for each JFrame

//import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends MouseTrackerFrame {

	
	public Graphics getGraphics1(){ 				// Method holds JPanel
		JPanel Bear = new JPanel(); 				// creates a new JPanel
		LabelFrame pic = new LabelFrame();			// show the image
		pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 	// Closes JFrame without ending program
		pic.setSize(850, 690);
		
		final JLabel label1;                                                       // JLabel with text and Icon		
		Icon bear = new ImageIcon(getClass().getResource("Eurasian_Brown_Bear.jpg"));
		label1 = new JLabel();                                                    
		label1.setText("Surprise! You found a Bear!");
		label1.setIcon(bear);                         							   // add icon to JLabel
		label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		Bear.add(label1);                             							  // add label1 to JFrame	
		pic.add(Bear);
		pic.setVisible(true);	
		return null;
	}
}
