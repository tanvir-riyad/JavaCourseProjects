import java.util.Scanner;
public class TestTriangle {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the value of three sides:");
		
		Scanner input=new Scanner(System.in);
		
		double side1= input.nextDouble();
		
		double side2 =input.nextDouble();
		
		double side3=input.nextDouble();
		
		input.nextLine();
		
		System.out.println("Enter the color:");
		
		String color =input.nextLine();
		
		System.out.println("Triangle filled:");
		
		boolean filled=input.nextBoolean();
		
		input.close();
		
		GeometricObject tr1=new Triangle(side1,side2,side3);
		
		tr1.setColor(color);
		
		tr1.setFilled(filled);
		
		System.out.println(tr1.toString());
		
		System.out.println(tr1.getArea());
		
		System.out.println(tr1.getPerimeter());
		
		System.out.println(tr1.getColor());
		
		System.out.println(tr1.isFilled());
						
		}		

}
