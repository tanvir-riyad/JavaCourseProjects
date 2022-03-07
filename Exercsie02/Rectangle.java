public class Rectangle {

	double width=1;
	double height=1;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double newWidth, double newHeight) {
		
		this.width=newWidth;
		this.height=newHeight;
		
	}
	
	public double getArea(){
		
		return width*height;
	}
	
	public double getPerimeter() {
		
		return 2*(width+height);
		
	}
