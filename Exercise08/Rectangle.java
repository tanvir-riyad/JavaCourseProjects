public class Rectangle extends GeometricObject {
	double width;
	double height;
	
	public Rectangle() {
		
		
		
	}
	
	public Rectangle(double newWidth, double newHeight) {
		
		width=newWidth;
		height=newHeight;
		
	}
	
	public Rectangle(double newWidth, double newHeight,String color,boolean filled) {
		
		super(color,filled);
		
		width=newWidth;
		height=newHeight;
		
	}
	
	public double getArea(){
		
		return width*height;
	}
	
	public double getPerimeter() {
		
		return 2*(width+height);
		
	}
	
	public void changeColor(String color) {
		
		
		super.setColor(color);
	}
	
	public String toString() {
		
		return "Rectangle: width = " + this.width + " height = " + this.height;
	}
	
	

}
