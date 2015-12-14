// fig 12.29 mousetrackerframe.java
// testing mousetrackerframe p509

//import MouseTFrame.MouseTrackerFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MouseTracker {
	
	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "CAUTION! \n THIS PROGRAM CONTAINS FLASHING LIGHTS! \n if you have any risk of seizures \nor epilepsy please let me know!");
		
	//	MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
	//	mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	mouseTrackerFrame.setSize(500, 500);
	//	mouseTrackerFrame.setVisible(true);
	
		
		MouseColor mouseColor1 = new MouseColor();
		mouseColor1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		mouseColor1.setSize(500, 500);
		mouseColor1.setVisible(true);
	
	}

}
