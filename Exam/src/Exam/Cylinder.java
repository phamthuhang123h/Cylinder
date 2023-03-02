package Exam;

public class Cylinder extends Circle {
	private double height;
	public Cylinder() {
		super();
		height = 1.0;
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return getArea()*height;
	}
	
	@Override
	public String toString() {      
	   return "Cylinder: subclass of " + super.toString() + " height=" + height;
	}

	public void setHeight(double double1) {
		// TODO Auto-generated method stub
		
	}

	public void setVolumn(double double1) {
		// TODO Auto-generated method stub
		
	}

	public void setArea(double double1) {
		// TODO Auto-generated method stub
		
	}
}
