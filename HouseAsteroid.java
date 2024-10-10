/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.houseasteroid;

import java.awt.*; // import draw stuff


import java.awt.geom.*; // import geom
import javax.swing.*; // import more draw stuff

import java.util.Random;
import java.awt.event.*; 
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


/**
 *
 * @author pres2590
 */
public class HouseAsteroid extends JPanel implements ActionListener, MouseListener{
    
      Random rand = new Random();
      int npose;
      
      int ballw=0;
      int ballh=0;
      int ballx=1000;
      int bally=1000;
     
      int a = rand.nextInt(10);
      int b = rand.nextInt(10);
         int xposa = 150;
          int xposb = 300; 
     
     Timer time = new Timer(5, this);
        int x=0, y=0;
        
         @Override
    public void mouseClicked(MouseEvent e) {
      System.out.println("CLicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    boolean thefunstuff = false;
    
        public void actionPerformed(ActionEvent e){
        
                
            if(x > 100&&thefunstuff==false){
                ballw= ballw+5;
                ballh=ballh+5;
                ballx= ballx-5;
                bally=bally-5;
                repaint();
                thefunstuff=true;
            }
            if(x > 100&&thefunstuff==true){
                ballw= ballw+5;
                ballh=ballh+5;
                 ballx= ballx-5;
                bally=bally-5;
                repaint();
                thefunstuff=false;
            }
          
        x += 10;

        y += 10;
        
       ;
         npose = npose++;
        xposa = xposa + a; 
        xposb = xposb + b; 

        repaint();
        
        }
        
        public void paint( Graphics g ) {
                         super.paintComponent(g);
                        
                       
        
               
            
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
          
       
          
            int[] xposas = {x, y+10, xposa};
          int[] yposas = {x+10, x, xposb};
          int nposas = 3;
                
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
                
             g.setColor(Color.GRAY);
        g.fillOval(x, y, 100, 100);
         g.fillPolygon(xposas, yposas, nposas);
         
          g.setColor(Color.yellow);
        g.fillOval(ballx, bally, ballw, ballh);
            time.start();
        }

     
      

    public static void main(String[] args) {
        
            Color Sky = new Color(196, 240, 254); // create sky color
        
      JFrame f = new JFrame("House"); // name frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set program to exit on close
        f.getContentPane().add(new HouseAsteroid()); // add graphics stuff to frame
        f.setSize(1900, 1000); // set frame size on start
        f.setLocation(0, 0); // set frame location on start
        f.setBackground(Sky);
    
  
        f.setVisible(true);
    }

   
}
