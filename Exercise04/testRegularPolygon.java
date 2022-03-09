import java.util.Scanner;
public class testRegularPolygon {
	
	public static void main(String[] main) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the number of sides: ");
		
		int n = input.nextInt();
		
		System.out.println("Enter the lengths of sides: ");
		
		double side= input.nextDouble();
		
		input.nextLine();
		
		System.out.println("Enter the color: ");
		
		String color=input.nextLine();
		
		System.out.println("Enter the filled: ");
		
		boolean filled = input.nextBoolean();
		
		input.close();
		
		GeometricObject go=new RegularPolygon(n,side);
		
		go.setColor(color);
		
		go.setFilled(filled);
		
		System.out.println(go.toString());
		
		System.out.println(go.getArea());
		
		System.out.println(go.getPerimeter());
		
		System.out.println(go.getColor());
		
		System.out.println(go.isFilled());	
	
		
	}

}
