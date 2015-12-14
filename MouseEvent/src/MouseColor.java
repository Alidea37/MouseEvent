// referenced Cordell & Mandy's FileIO sample
//https://moodle.carroll.edu/pluginfile.php/30497/mod_resource/content/1/AlternateFileMethods.java

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.security.*;



public class MouseColor  extends MouseTrackerFrame
{
	
	private int clickcount = 0;
	private int dragcount = 0;
	
	private Random random = new Random();
	
	// array of colors for mouse dragged.
	private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.LIGHT_GRAY, Color.CYAN, Color.DARK_GRAY, Color.ORANGE, Color.PINK, Color.YELLOW, Color.RED, Color.GRAY};
	
	private File out = new File("MouseActivity.txt"); // create a file to count mouse dragged event
	private FileOutputStream outFileStream;
	
	
	
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
				mousePanel.setBackground(Color.MAGENTA);
				mousePanel.repaint();
			
			}

			@Override
			public void mouseDragged(MouseEvent event) { 	// mouse is dragged
				
				try {
					outFileStream = new FileOutputStream(out);
					PrintWriter outStream = new PrintWriter(outFileStream);

						if (dragcount < 999){		// count the number of total colors cycled through drag events
							dragcount = dragcount + 1;
							outStream.println("The mouse was dragged " +dragcount);
										
									}
										outStream.close();
											} catch (FileNotFoundException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
													
													}
				
				int randomColor = random.nextInt(8); // randomizes colors for mouse drag event
				
				statusBar.setText(String.format("Dragged at [%d, %d]",
						event.getX(), event.getY()));
				switch (randomColor) // randomizes which color is used during mouse drag event
			
				{
					case 0:{mousePanel.setBackground(colors[0]); try{Thread.sleep(200);} // I had to place a break at the end of each case to make it select more than one color
					catch (Exception e){}; break;}
					case 1:{mousePanel.setBackground(colors[1]); try{Thread.sleep(200);} // Added a pause in each case to slow them down.
					catch (Exception e){};break;}
					case 2:{mousePanel.setBackground(colors[2]); try{Thread.sleep(200);}
					catch (Exception e){};break;}
					case 3:{mousePanel.setBackground(colors[3]); try{Thread.sleep(200);}
					catch (Exception e){};break;}
					case 4:{mousePanel.setBackground(colors[4]); try{Thread.sleep(200);}
					catch (Exception e){};break;}
					case 5:{mousePanel.setBackground(colors[5]); try{Thread.sleep(200);}
					catch (Exception e){};break;}
					case 6:{mousePanel.setBackground(colors[6]); try{Thread.sleep(200);}
					catch (Exception e){};break;}
					case 7:{mousePanel.setBackground(colors[7]); try{Thread.sleep(200);}
					catch (Exception e){};break;}
					case 8:{mousePanel.setBackground(colors[8]); try{Thread.sleep(200);}
					catch (Exception e){};break;}
				}
			}

			@Override
			public void mouseMoved(MouseEvent event) { // mouse is moved
				
				
			}

			@Override
			public void mouseEntered(MouseEvent event) { // mouse enters JFrame
				
			}

			@Override
			public void mouseExited(MouseEvent event) { // mouse exits JFrame
				
				
			}

			@Override
			public void mouseClicked(MouseEvent event) { // mouse is clicked
			
				if (clickcount < 5){		// If the counter is less than 5 run game
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
			public void mouseReleased(MouseEvent event) { // release mouse
				
			}
		
		}
	
}