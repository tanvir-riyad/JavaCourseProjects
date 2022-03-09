import java.lang.Math;
public class RegularPolygon extends GeometricObject {
	
		
		private int n;
		
		private double side;
		
		private double x;
		
		private double y;
		
		public RegularPolygon() {
			
			n=3;
			side=1;
			x=0;
			y=0;
			
		}
		
		public RegularPolygon(int n,double side) {
			
			this.n=n;
			this.side=side;
			this.x=0;
			this.y=0;
			
		}
		
		public RegularPolygon(int n,double side,double x,double y) {
			
			this.n=n;
			this.side=side;
			this.x=x;
			this.y=y;
			
		}
		
		
		public int getN() {
			return n;
		}
		
		public void setN(int n) {
			
			this.n=n;
			
		}
		
		public double getSide() {
			return side;
		}
		
		public void setSide(double side) {
			
			this.side=side;
			
		}
		
		public double getX() {
			return x;
		}
		
		public void setX(double x) {
			
			this.x=x;
			
		}
		
		public double getY() {
			return y;
		}
		
		public void setY(double y) {
			
			this.y=y;
			
		}
		
		public double getPerimeter() {
			
			return n*side;
		}
		
		public double getArea() {
			
			return (n*side*side)/(double)(4*Math.tan(Math.PI/n));
		}
		
		public String toString() {
			
			return "RegularPolygon: number of sides = " + n + " side length = " + side;
		}
		
		public static void main(String[] args) {
			
			RegularPolygon  pol1= new RegularPolygon();
			
			RegularPolygon  pol2= new RegularPolygon(6,4);
			
			RegularPolygon  pol3= new RegularPolygon(10,4,5.6,7.8);
			
			pol1.getPerimeter();
			
			System.out.println(pol1.getArea());
			
			System.out.println(pol2.getPerimeter());
			
			System.out.println(pol2.getArea());
			
			System.out.println(pol3.getPerimeter());
			
			System.out.println(pol3.getArea());
			
			
			
		}

	}
