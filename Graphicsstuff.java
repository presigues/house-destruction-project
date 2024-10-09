/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphicsstuff;
// imports 
import java.awt.*; // awt fo draw and canvas

import java.awt.geom.*; // import geometry
import javax.swing.*; 


/*
Name : Preton Messina
Date : Friday October 4th, 2024
Project Name : House Drawing
Desc : A project where i use graphics in java to draw a house. with multiple additions
 */
public class Graphicsstuff extends JPanel implements ActionListener { 
    /**
     * @param args the command line arguments
     * 
     * 
     */
    
    int x, y;
    
  
       Timer timer;
      
       
       Graphicsstuff(){
           x = 0;
           y = 0;
           timer = new Timer(20, this);
        
       }
      
       
        public void actionPerformed(ActionEvent e){
          
        x += 1;

        y += 1;

        repaint();
    }
    

       public void paint( Graphics g ) // where draw commands are written
    {
           
             super.paintComponent(g);

        g.fillOval(x, y, 10, 10);
            
            
        // CUSTOM COLORS ----------------------------------
        Color HouseBrown = new Color(162, 122, 71);
        Color Door = new Color(98, 78, 55);
        Color Grass = new Color(67, 147, 93);
        // ------------------------------------------------
               
            
        // ROOF POS -----------------------------------      
          int[] xpos = {500, 750, 1000};
          int[] ypos = {300, 150, 300};
          int npos = 3;
          // ------------------------------------------
                
        // draw door 
          g.setColor(Door);
          g.fillRect(550,100,100,300);
                 
        // draw house
        g.setColor(HouseBrown);
        g.fillRect(500, 300, 500, 500);
        
        // draw garage 
        g.setColor(HouseBrown);
        g.fillRect(800, 500, 500, 300);
        
        // draw door
        g.setColor(Door);
        g.fillRect(700, 650, 100, 150);
        
        // draw door handle 
        g.setColor(Color.yellow);
        g.fillOval(780, 730, 10, 10);
        
        // draw garage door
        g.setColor(Door); 
        g.fillRect(1025, 600, 250, 200);
        
        // draw grass
        g.setColor(Grass);
        g.fillRect(0, 800, 2000, 200);
        
        // draw driveway
        g.setColor(Color.gray);
        g.fillRect(1000, 800, 300, 200);
        
        // draw roof
        g.setColor(Door);
        g.fillPolygon(xpos, ypos, npos);
        
        //draw windows
        g.setColor(Color.CYAN);
        g.fillRect(575, 400, 100, 100);       
        g.setColor(Color.CYAN);
        g.fillRect(800, 400, 100, 100);
        
       // draw tree 
        g.setColor(Door);
        g.fillRect(1600, 400, 100, 400);
 
        g.setColor(Grass);
        g.fillOval(1600, 350, 100, 100);     
        g.fillOval(1550, 350, 100, 100);     
        g.fillOval(1500, 400, 100, 100);    
        g.fillOval(1450, 400, 100, 100);     
        g.fillOval(1600, 350, 100, 100);           
        g.fillOval(1650, 400, 100, 100);            
        g.fillOval(1700, 400, 100, 100);         
        g.fillOval(1550, 250, 100, 100);           
        g.fillOval(1500, 300, 100, 100);             
        g.fillOval(1450, 300, 100, 100);
        g.fillOval(1600, 200, 100, 100);               
        g.fillOval(1650, 250, 100, 100);       
        g.fillOval(1700, 300, 100, 100);
                
                
        
       
    }
       
   
    public static void main(String[] args){
        
          Color Sky = new Color(196, 240, 254); // create sky color
        
      JFrame f = new JFrame("House"); // name frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set program to exit on close
        f.getContentPane().add(new Graphicsstuff()); // add graphics stuff to frame
        f.setSize(1900, 1000); // set frame size on start
        f.setLocation(0, 0); // set frame location on start
        f.setBackground(Sky);
        Graphicsstuff s = new Graphicsstuff();
        f.add(s);// set background color
        
        
       
        f.setVisible(true); // set frame to visible 
          s.timer.start();
        // TODO code application logic here
    }
    
}
