package matrixMultiplication;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Planet {
	
	float x;
	float y;
    double rotation=-1;
    double transform1= Math.toRadians(rotation);
    double transform2=(Math.toRadians(rotation))*-1;
    double transform3=Math.toRadians(rotation);
    double transform4=Math.toRadians(rotation);
   
	Ellipse2D.Double planetImage;
	double x2=0;
	double y2 = 200;;
	int counter=0;
	



   
	
	public Planet(float x , float y) {
		this.x=x;
		this.y=y;
		
	}
	
	
	
	public void transform() {
		 transform1= Math.cos(transform1);;
		 transform2= Math.sin(transform2);;
		 transform3= Math.sin(transform3);;
		 transform4= Math.cos(transform4);;
		  
	}
	
	public void draw(Graphics2D g) {
		planetImage=new Ellipse2D.Double(x, y, 30,30);
		g.draw(planetImage);
	}
	
	
	public void orbit() {
		
  		 //System.out.println(x2 + "," + y2);
		counter+=1;
		System.out.println(counter);
		if(counter==1) {
			 transform();

			
		}
		
		   float[]  inputData1=new float[] { (float) transform1,(float) transform2,(float) transform3,(float) transform4};
   		   Matrix m1=new Matrix(2,2);
   		   m1.getInputDataV2(inputData1);
   		   
   		   float[]  inputData2=new float[] {(float) x2,(float) y2};
   		   Matrix m2= new Matrix(2,1);
		   m2.getInputDataV2(inputData2);
		   
	   	   Matrix m3 = m1.matrixMultiplicationV1(m2);
	   	
	   	   x2=   m3.data[0][0];
	   	   y2=   m3.data[1][0];

	   	   
	   	  x=(float) (500+x2);
   		  y=(float) (500-y2);
   		// m1.displayMatrix();

   		 //System.out.println(x2 + "," + y2);
   		// System.out.println("Orbit");
   		 
   		




	}
	
public void paint(Graphics g) {
		
		Graphics2D g2= (Graphics2D) g;
		planetImage=new Ellipse2D.Double(x, y, 30,30);

		g2.draw(planetImage);
		
 
     
         
   } 	
	
     
      
	

}
