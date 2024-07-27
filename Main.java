package matrixMultiplication;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Main {
	
	
	int moveDirection;
	static Timer timer,timer2;	
	
	static double x2;
	static double y2 ;
	
	static double x3;
	static double y3;
	
	static double x6 ;
	static double y6 ;
	
	static double x7;
	static double  y7;
	
	static double x8;
	static double y8;


	
	
	static double rotation=-1;
	static double rotation2=-2;

	static double transform1= Math.toRadians(rotation);
   static double transform2=(Math.toRadians(rotation))*-1;
    static double transform3=Math.toRadians(rotation);
    static double transform4=Math.toRadians(rotation);
	

	static double transform5= Math.toRadians(rotation2);
   static double transform6=(Math.toRadians(rotation2))*-1;
    static double transform7=Math.toRadians(rotation2);
    static double transform8=Math.toRadians(rotation2);
	
	
	static PlanetPanel panel;

	

        
     
	
   public static void main(String[] args) {
	   graphics();
	   
	   
  
   
   }
   
  
   
   public static void graphics() {
	   
	   JFrame window = new JFrame(); 
       window.setFocusable(false);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       window.setSize(1000, 1000);; 
       window.setVisible(true); 
       
       Line line = new Line();
       
       window.add(line);

      // panel= new PlanetPanel();
       
     //  window.add(panel);
       
       
       transform1= Math.cos(transform1);;
		 transform2= Math.sin(transform2);;
		 transform3= Math.sin(transform3);;
		 transform4= Math.cos(transform4);;
		 
		 transform5= Math.cos(transform5);;
		 transform6= Math.sin(transform6);;
		 transform7= Math.sin(transform7);;
		 transform8= Math.cos(transform8);;
       
      
      
       
       x6=500-line.triangle.xpoints[2];
       y6=500-line.triangle.ypoints[2];
       x2=500-(line.triangle.xpoints[0]);
       y2=500-(line.triangle.ypoints[0]);
       x3=500-line.triangle.xpoints[1];
       y3=500-line.triangle.ypoints[1];
       
       
       x7= (500-line.circle.x);
       y7= (500-line.circle.y);
       
       x8 =  (line.circle.x-line.circle2.x);
       y8 = (line.circle.y-line.circle2.y);
       
       
      x7 =  (500-line.circle.getCenterX());
       y7 =  (500-line.circle.getCenterY());
       
       x8 =  (line.circle.getCenterX()-line.circle2.getCenterX());
       y8 =  (line.circle.getCenterY()-line.circle2.getCenterY());
       
       System.out.println(x7 + "," + y7);
       System.out.println(x8 + "," + y8);

     
       timer=new Timer(50, new ActionListener() {

   		@Override
   		// Method to call the animation method and to repaint and the component.
   		public void actionPerformed(ActionEvent e) {
   		
   			
   			   //System.out.println("timer");
   	      // panel.planet.orbit();
     		 float[]  inputData1=new float[] { (float) transform1,(float) transform2,(float) transform3,(float) transform4};

   		   float[]  inputData2=new float[] { (float) transform5,(float) transform6,(float) transform7,(float) transform8};

   		   float[]  inputData6=new float[] {(float) x7,(float) y7};
   		   float[]  inputData7=new float[] {(float) x8,(float) y8};


   		   
   		   Matrix m1=new Matrix(2,2);
		   m1.getInputDataV2(inputData1);
		   
   		   Matrix m2=new Matrix(2,2);
  		   m2.getInputDataV2(inputData2);
  		   
  		   Matrix m3=new Matrix(2,1);
 		   m3.getInputDataV2(inputData6);
 		   
 		  

   		 

 		   
 		   Matrix m12= new Matrix(2,1);
		   m12.getInputDataV2(inputData7);
   		   
   		   
		   
	   	   Matrix m4 = m1.matrixMultiplicationV1(m3);
	   	   Matrix m10 = m2.matrixMultiplicationV1(m12);

	   	
   		  
	   	 
	   	 x7=   m4.data[0][0];
	   	 y7=    m4.data[1][0];
	   	 
	   	 x8= m10.data[0][0];
	   	 y8=  m10.data[1][0];

	   	 
	   
	   	 
	  	line.line2.x1=500;
   		line.line2.x2=line.circle.getCenterX();
   		line.line2.y1=500;
   		line.line2.y2=line.circle.getCenterY();
   		
	   	 
	   	double x10=Math.pow((line.line2.x2-line.line2.x1), 2);
        double y10=Math.pow((line.line2.y2-line.line2.y1), 2);
        double distance=( Math.sqrt(x10+y10));
        System.out.println(distance);
        
       
        
	 
	
   		line.circle.x=500+x7-(line.circle.width/2);
   		line.circle.y=500-y7-(line.circle.height/2);

   				
   		line.circle2.x=line.circle.getCenterX()+x8-(line.circle2.width/2);
   		line.circle2.y=line.circle.getCenterY()-y8-(line.circle2.width/2);
   		
   		
   		
         
   		
	     window.repaint();

   		};



   	 });
       
       
	   timer.start();

      
  
	
   }
   

   
}
