public class Circle extends GeometricObject {
	
	private double radius;
	
	public Circle() {
		
		
	}
	
	public Circle(double radius) {
		
		this.radius=radius;
		
	}
	
	public Circle(double radius,String color,boolean filled) {
		
		super(color,filled);
		this.radius=radius;
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	public void setRadius(double radius) {
		
		
		this.radius=radius;
	}
	
	public double getDiameter() {
		
		return radius*2;
	}
	
	public double getArea() {
		
		return Math.PI*radius*radius;
		
		
	}
	
	public double getPerimeter() {
		
		return 2*Math.PI*radius;
		
		
		
	}
	
	public void printCircle() {
		 
		System.out.println("the circle is created "+getDateCreated()+" and the radius is "+radius);
		
		
	}
	public String toString() {
		
		return "Circle: radius = " + this.radius;
 
	}

	

}
