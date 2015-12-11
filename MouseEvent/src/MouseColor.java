import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class MouseColor  extends MouseTrackerFrame
{
	
	private int clickcount = 0;
	
	
	
	public MouseColor()
	{
		// create and register listener for mouse and mouse motion events
				MouseHandler handler = new MouseHandler();
				mousePanel.addMouseListener(handler);
				mousePanel.addMouseMotionListener(handler);
		
	}
	
		private class MouseHandler implements MouseListener,
		MouseMotionListener
		{
			// handle event when mouse is clicked
			@Override
			public void mousePressed(MouseEvent event)
			{
				statusBar.setText(String.format("Clicked at [%d, %d]",
						event.getX(), event.getY()));
				mousePanel.setBackground(Color.ORANGE);
				mousePanel.repaint();
			
			}

			@Override
			public void mouseDragged(MouseEvent event) { 	
				
				
				
			}

			@Override
			public void mouseMoved(MouseEvent event) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent event) {
				
				
			}

			@Override
			public void mouseExited(MouseEvent event) {
				
				
			}

			@Override
			public void mouseClicked(MouseEvent event) {
			
				if (clickcount < 3){		// If the counter is less than 3 run game -AO
					clickcount = clickcount + 1;
					statusBar.setText(String.format("Clicked at [%d, %d]" + clickcount,
					event.getX(), event.getY()));
				}
				
				else
				{
					LabelFrame pic = new LabelFrame(); // to get bear pic
					pic.getGraphics1();
				}
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				
			}
		
		}
	}
