package matrixMultiplication;

import java.awt.geom.Line2D;

public class Matrix {
	float[][] data;
	int row;
	int column;
	
	
	public Matrix(int row, int column){
		this.row=row;
		this.column=column;
        this.data=new float[row][column];
		
	}
	
	public void getInputData(int[] inputData) {
	    int index=0;
	    
	    for (int i=0; i<row;i++) {
	    	for (int j=0;j<column;j++) {
	    		data[i][j]=inputData[index];
	    		index++;
	    	}
	    }

	}
	
	public void getInputDataV2(float[] inputData) {
	    int index=0;
	    
	    for (int i=0; i<row;i++) {
	    	for (int j=0;j<column;j++) {
	    		data[i][j]=  inputData[index];
	    		index++;
	    	}
	    }

	}
	
	public Matrix matrixMultiplicationV1(Matrix matrix) {
		Matrix  resultMatrix=new Matrix(this.row,matrix.column);
		for(int i = 0 ;i<this.row; i++) {
			for (int j=0;j<matrix.column;j++) {
				for (int k=0;k<this.column;k++) {
					resultMatrix.data[i][j]+=this.data[i][k]*matrix.data[k][j];
				}
				
			}
			
		}
		return resultMatrix;
	}
	
	
	public Matrix matrixVectorMultiplication1(Vector v) {
		Matrix  resultMatrix=new Matrix(this.row,v.length);
		for(int i = 0 ;i<this.row; i++) {
			for (int j=0;j<1;j++) {
				for (int k=0;k<this.column;k++) {
					resultMatrix.data[i][j]+=this.data[i][k]*v.componentArray[k];
				}
				
			}
			
		}
		return resultMatrix;
	}
	
	public Vector matrixVectorMultiplication2(Vector v) {
		Vector vector=new Vector();
		for(int i = 0 ;i<this.row; i++) {
			for (int j=0;j<1;j++) {
				for (int k=0;k<this.column;k++) {
					vector.componentArray[i]+=this.data[i][k]*v.componentArray[k];
				}
				
			}
			
		}
		return vector;
	}
	
	
	public void displayMatrix() {
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	


}
