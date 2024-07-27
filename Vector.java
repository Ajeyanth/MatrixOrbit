package matrixMultiplication;

public class Vector {
	int xComponent;
	int yComponent;
	int[] componentArray;
	int length;
	
	public Vector(int x,int y) {
		this.xComponent=x;
		this.yComponent=y;
		componentArray=new int[2];
		componentArray[0]=xComponent;
		componentArray[1]=yComponent;
		this.length=2;
		
	}
	
	public Vector() {
		componentArray=new int[2];
		componentArray[0]=xComponent;
		componentArray[1]=yComponent;
		this.length=2;
		
	}
	
	
	public void setVector(int x,int y) {
		this.xComponent=x;
		this.yComponent=y;
		componentArray[0]=xComponent;
		componentArray[1]=yComponent;
	}
	
	public void setVector(Vector vector) {
		this.xComponent=vector.xComponent;
		this.yComponent=vector.yComponent;
		componentArray[0]=xComponent;
		componentArray[1]=yComponent;
	}
	
	public void addVector(Vector vector) {
		this.xComponent+=vector.xComponent;
		this.yComponent+=vector.yComponent;
		componentArray[0]=xComponent;
		componentArray[1]=yComponent;
	}

}
