import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import MouseTFrame.MouseTrackerFrame;


public class MouseColor  extends MouseTrackerFrame
{
	
	public MouseColor()
	{
		System.out.println("Test3");
		// create and register listener for mouse and mouse motion events
				MouseHandler handler = new MouseHandler();
				mousePanel.addMouseListener(handler);
				mousePanel.addMouseMotionListener(handler);
		
	}
	
		private class MouseHandler implements MouseListener,
		MouseMotionListener
		{
			// handle event when mouse is right clicked
			@Override
			public void mousePressed(MouseEvent event)
			{
				statusBar.setText(String.format("Clicked at [%d, %d]",
						event.getX(), event.getY()));
				mousePanel.setBackground(Color.RED);
				mousePanel.repaint();
				System.out.println("Testing red");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		}
	}
