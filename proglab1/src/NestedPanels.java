
import javax.swing.*;
import java.awt.*;

public class NestedPanels {
 public static void main(String[] args) {
  JFrame frame = new JFrame("Nested Panels");
  frame.setVisible(true);
  frame.setSize(new Dimension(675, 325));
    
    
  // create the first panel and a label
  JPanel subPanel_1 = new JPanel();
  JLabel label_1 = new JLabel("Hello");
  subPanel_1.add(label_1);
  subPanel_1.setBackground(Color.blue);
  subPanel_1.setPreferredSize(new Dimension (200, 200));
  label_1.setAlignmentX(Component.CENTER_ALIGNMENT);
  label_1.setAlignmentY(Component.TOP_ALIGNMENT);
  
  // create second panel and label
  JPanel subPanel_2 = new JPanel();
  JLabel label_2 = new JLabel("Hide or Show Selected Color");
  subPanel_2.add(label_2);
  subPanel_2.setPreferredSize(new Dimension (200, 200));
  subPanel_2.setBackground(Color.red);
  BoxLayout boxLayout_0 = new BoxLayout(subPanel_2,BoxLayout.Y_AXIS);
  subPanel_2.setLayout(boxLayout_0);
  label_2.setAlignmentX(Component.CENTER_ALIGNMENT);
  label_2.setAlignmentY(Component.TOP_ALIGNMENT);
  
    
  //create and align buttons 
  JButton button_1 = new JButton();//("Pink");
  button_1.setPreferredSize(new Dimension (80, 80));
  button_1.setText("Pink");
  //shortcut for setText is to just include it when we create our button
  JButton button_2 = new JButton("Green");
  button_2.setPreferredSize(new Dimension (80, 80));
  JButton button_3 = new JButton("White");
  button_3.setPreferredSize(new Dimension (80, 80));
 
  //create new subPanel for our buttons, set its background to red so it matches our parent box
  JPanel subPanel_2_Box = new JPanel();
  subPanel_2_Box.setBackground(Color.red);
  subPanel_2_Box.setAlignmentX(Component.CENTER_ALIGNMENT);
    
  
  //BoxLayout so we can align our buttons relative to each other within subPanel_2_Box
  BoxLayout boxLayout_1 = new BoxLayout(subPanel_2_Box,BoxLayout.Y_AXIS);
  subPanel_2_Box.setLayout(boxLayout_1);
  
  
  //originally used SwingConstants.CENTER but that did not align the buttons themselves (a component of subPanel_2_Box) 
  
  button_1.setAlignmentX(Component.CENTER_ALIGNMENT);
  button_1.setAlignmentY(Component.TOP_ALIGNMENT);
  
  button_2.setAlignmentX(Component.CENTER_ALIGNMENT);
  button_2.setAlignmentY(Component.CENTER_ALIGNMENT);
  
  button_3.setAlignmentX(Component.CENTER_ALIGNMENT);
  button_3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
    
  //new panel with 3 subpanels
  JPanel subPanel_3 = new JPanel();
  JLabel label_3 = new JLabel("Panel of 3 Subpanels");
  label_3.setAlignmentX(Component.CENTER_ALIGNMENT);
  label_3.setAlignmentY(Component.TOP_ALIGNMENT);
  
  
  //BoxLayout within a new subpanel again
  BoxLayout boxLayout_2 = new BoxLayout(subPanel_3,BoxLayout.Y_AXIS);
  subPanel_3.setLayout(boxLayout_2);
  subPanel_3.add(label_3);
  subPanel_3.setBackground(Color.orange);
  subPanel_3.setPreferredSize(new Dimension (200, 200));
  subPanel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
  subPanel_3.setAlignmentY(Component.CENTER_ALIGNMENT);
  
  
  
  JPanel miniPanel_a = new JPanel();
  JLabel label_a = new JLabel("1");
  miniPanel_a.add(label_a);
  miniPanel_a.setPreferredSize(new Dimension (50, 50));
  miniPanel_a.setBackground(Color.pink);
  miniPanel_a.setAlignmentX(Component.CENTER_ALIGNMENT);
  miniPanel_a.setAlignmentY(Component.TOP_ALIGNMENT);
  
  
  JPanel miniPanel_b = new JPanel();
  JLabel label_b = new JLabel("2");
  miniPanel_b.add(label_b);
  miniPanel_b.setPreferredSize(new Dimension (50, 50));
  miniPanel_b.setBackground(Color.green);
  miniPanel_b.setAlignmentX(Component.CENTER_ALIGNMENT);
  miniPanel_b.setAlignmentY(Component.TOP_ALIGNMENT);
  
  
  JPanel miniPanel_c = new JPanel();
  JLabel label_c = new JLabel("3");
  miniPanel_c.add(label_c);
  miniPanel_c.setPreferredSize(new Dimension (50, 50));
  miniPanel_c.setBackground(Color.white);
  miniPanel_b.setAlignmentX(Component.CENTER_ALIGNMENT);
  miniPanel_b.setAlignmentY(Component.TOP_ALIGNMENT);
  
  

  JPanel primary = new JPanel();
  primary.add(subPanel_1);
  primary.add(subPanel_2);
  primary.add(subPanel_3);
  

 //add our buttons to subPanel_2 via subPanel_2_Box so we have BoxLayout of the buttons
  JPanel secondary = subPanel_2;
  secondary.add(subPanel_2_Box);
  subPanel_2_Box.add(button_1);
  subPanel_2_Box.add(button_2);
  subPanel_2_Box.add(button_3);
  
//add minipanels of color (a b and c) to subPanel_3
  JPanel tertiary = subPanel_3;
  tertiary.add(miniPanel_a);
  tertiary.add(miniPanel_b);
  tertiary.add(miniPanel_c);
  
    
  frame.getContentPane().add(primary);
  
  }

}