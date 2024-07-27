package matrixMultiplication;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Line extends JComponent {
	

	Line2D.Double line = new Line2D.Double(500,100,500,300);
	Line2D.Double xAxis = new Line2D.Double(0,500,1000,500);
	Line2D.Double yAxis = new Line2D.Double(500,0,500,1000);
	Ellipse2D.Double circle= new Ellipse2D.Double(485, 300, 30, 30);
	Ellipse2D.Double circle2= new Ellipse2D.Double(495, 250, 10, 10);
	Line2D.Double line2 = new Line2D.Double(500,500,circle.getCenterX(),circle.getCenterY());



	


	int[] x = {400,600,500};
	int[] y = {300,300,100 };
	
	Polygon triangle = new Polygon();


	
	
	
	
	
   public void paint(Graphics g) {
		
		Graphics2D g2= (Graphics2D) g;
		
 
      // g2.draw(line); 
       g2.draw(xAxis);
       g2.draw(yAxis);
       
       triangle.xpoints=x;
       
       
       g2.draw(circle);
       g2.draw(circle2);
      // g2.draw(line2);
       

    		   
       triangle.ypoints=y;
       triangle.npoints=3;
       //g2.drawPolygon(triangle);
         
   } 	
   
   public void paint1(Graphics g) {
		
		Graphics2D g2= (Graphics2D) g;
		

     // g2.draw(line); 
      g2.draw(xAxis);
      g2.draw(yAxis);
      
     
      
      
      g2.draw(circle);
      g2.draw(circle2);
     // g2.draw(line2);
      

  
  } 	
	
	
} 


