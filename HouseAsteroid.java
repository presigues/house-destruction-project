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
import java.io.File;
import javax.imageio.ImageIO;


/**
 *
 * @author pres2590
 */
public class HouseAsteroid extends JPanel implements ActionListener{
    
      Random part = new Random();
      
      // EXPLOSION PARTICLE ------------------------------------
   
      int partspeedy1 = part.nextInt(10);
      int partspeedx1 = part.nextInt(10);
      int partspeedy2 = part.nextInt(10);
      int partspeedx2 = part.nextInt(10);
      
      int partmove1;
      int partmove2;
     
          
        
        
          
          // EXPLOSION -----------------------------------------
          
          int sizeY = 10;
          int sizeX = 10;
          
          int size1;
          int size2;
          int size3;
          int size4;
          
    // COLOR SHIFT -----------------------------------------------
          int colora = 67;
          int colorb= 185;
          
      
    // TIMER ---------------------------
     Timer time = new Timer(20, this);
     
     // Meteor Start Pos ----------------
        int x=300, y=0;
        
  

    
   
 
    // Start ------------------------------------------------------------
        public void actionPerformed(ActionEvent e){
        
            if(x>=450&&size4<=2200){
                
                if(colora<166){
                colora=colora+2;
          
                }
                
                if(colorb<200){
                     colorb=colorb+2;
                }
                                 
              size4+=35;
          
                repaint();
                
                if(size3<1600){
                    size3+=15;
                repaint();
                
                if(size2<900){
                       size2+=10;
                repaint();
                
                if(size1<400){
                     size1+=6;
                repaint();  
                }
                }
                }
                
                
                
                
             
               
           
            }
      
          
        x += 4;

        y += 8;
        
        if(sizeY<200&&sizeX<200){
        sizeY+=10;
        sizeX+=10;
        }
        
       
        

        repaint();
        
        }
        
        public void paint( Graphics g ) {
                         super.paintComponent(g);
                         
                      
                        
                       
          
               
            
        // CUSTOM COLORS ----------------------------------
        Color HouseBrown = new Color(162, 122, 71);
        Color Door = new Color(98, 78, 55);
          Color Sky = new Color(colorb, 253, 248); // create sky color
        Color Grass = new Color(colora, 147, 93);
          Color ex1 = new Color(245, 245, 161);
          Color ex2 = new Color(255, 255, 40);
          Color ex3 = new Color(255, 167, 40);
         Color ex4 = new Color( 227, 84, 40);
        // ------------------------------------------------
               
            
        // ROOF POS -----------------------------------      
          int[] xpos = {500, 750, 1000};
          int[] ypos = {300, 150, 300};
          int npos = 3;
          // ------------------------------------------
          
             // ASTEROID POS -----------------------------------      
          int[] xposa = {10+x, 100+x, 200+x,300+x, 400+x, 40+x, 60+x};
          int[] yposa = {100+y, 150+y,180+y, 200+y, 10+y, -100+y, -150+y};
          int nposa = 7;
        
          // ------------------------------------------
          
       
          
         g.setColor(Sky);
            g.fillRect(0,0,2000,2000);
       
        
                
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
           
    //g.fillOval(x, y, sizeY, sizeX);
        g.fillPolygon(xposa, yposa, nposa);
        
                
          // draw grass
        g.setColor(Grass);
        g.fillRect(0, 800, 2000, 200);
        
        g.setColor(ex4);
         g.fillOval(700- size4/2,400- size4/2, size4, size4);
              g.setColor(ex3);
         g.fillOval(700- size3/2,400- size3/2, size3, size3);
          g.setColor(ex2);
         g.fillOval(700- size2/2,400- size2/2, size2, size2);       
          g.setColor(ex2);
         g.fillOval(700- size2/2,400- size2/2, size2, size2);
       
       g.setColor(ex1);
        g.fillOval(700- size1/2,400- size1/2, size1, size1); 
        
        g.setColor(Color.black);
        g.fillOval(700, 500, 0, 0);
         g.fillOval(700, 400, 0, 0);
          g.fillOval(500, 450, 0, 0);
        
        
        
        
            time.start();
            
            
            
        }

     
      

    public static void main(String[] args){
        
          
        
      JFrame f = new JFrame("House"); // name frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set program to exit on close
        f.getContentPane().add(new HouseAsteroid()); // add graphics stuff to frame
        f.setSize(1900, 1000); // set frame size on start
        f.setLocation(0, 0); // set frame location on start
       
    
  
        f.setVisible(true);
    }

   
}
