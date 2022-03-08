public class testRegularPolygon{
	
	public static void main(String[] args){
		
		RegularPolygon  pol1= new RegularPolygon();
		
		RegularPolygon  pol2= new RegularPolygon(6,4);
		
		RegularPolygon  pol3= new RegularPolygon(10,4,5.6,7.8);
		
		pol1.getPerimeter();
		
		pol1.getArea();
		
		pol2.getPerimeter();
		
		pol2.getArea();
		
		pol3.getPerimeter();
		
		pol3.getArea();
		
}
}
