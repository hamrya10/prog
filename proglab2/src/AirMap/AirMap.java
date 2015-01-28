package AirMap;
/**
 * Who wrote this anyway and what does it do?
 */

import java.awt.*;
import java.awt.geom.*; //for some reason awt* did not import geom
import java.util.ArrayList;

import javax.swing.*;




public class AirMap extends JPanel{ 
	
  public static void showMap(){
    JFrame frame = new JFrame("Flight Map");
    AirMap map = new AirMap();
  
    map.setPreferredSize(new Dimension(1280,720));
  
    frame.getContentPane().add(map);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    frame.pack();
    frame.setVisible(true);
  }
  
  
  //tried changing our method to Graphics2D for more functionality but it broke the display
  public void paintComponent(Graphics gr){ 
    super.paintComponent(gr);
    //found this via stackoverflow. adds Graphics2D to Graphics. Changing the actual method to paintComponent(Graphics2D etc broke the windows somewhere
    Graphics2D g2d = (Graphics2D)gr; 
    
    //these only ever worked with Graphics2D. Problem was that the rotation would push it off the view area 
    //and I can't figure out the new coordinates to reset origin
    //g2d.scale(.75, .75); //scaling works fine though
    //g2d.translate(-50*-5, 160*-5);
    
    //get a reference of the affine transform of the original coordinate system so that we can go back to it after our transform
    AffineTransform defaultAt = g2d.getTransform();
    // make new affine transform for rotation
  
    
  //-157.922 is the lowest longtitude so we can use translate to shift our origin's xy
   g2d.translate(160*13, 50*15);
   g2d.scale(.85, .85); //scaling works too
   
   
    // draw on the new coordinate system
    for(int i = 0; i < Airport.Airports.size(); i++)
    {
    	g2d.drawString(Airport.Airports.get(i).name(),
				Math.round(Airport.Airports.get(i).getLong())*15,
				Math.round(Airport.Airports.get(i).getLat())*-15
				);
    }
    
    // restore the original coordinate system (ie: origin at 0,0)
  
  }  
   
}