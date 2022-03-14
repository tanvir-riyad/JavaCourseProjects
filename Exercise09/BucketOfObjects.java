import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class BucketOfObjects {
	
	private List<GeometricObject> items=new ArrayList<GeometricObject>();
	
	
	
	public BucketOfObjects() {
		
		
	}
	
	public void addObject(GeometricObject go) {
		
		items.add(go);
		}
		
		
	
	
	public double getTotalArea() {
		
		double a=0;
		
		for(int i=0;i<items.size();i++) {
			
			a=a+items.get(i).getArea();	
			
		}
		
		return a;
	}
	
	public double getTotalPerimeter() {
		
		double a=0;
		
		for(int i=0;i<items.size();i++) {
			
			a=a+items.get(i).getPerimeter();	
			
		}
		
		return a;
	}

	public String toString() {
		
		
		
		ArrayList<String> str = new ArrayList<String>();
	    for (int i = 0; i < items.size(); i++) {
	        str.add(items.get(i).getClass().getName());
	        
	    }
	    
	    String a=str.toString();
	    
	    a = a.replace("[", "")
	            .replace("]", "");
	            //.replace(" ", "");    
	    //System.out.println(a);
		
		
		return a;
	
	
}
	
	public void removeObject(GeometricObject go) {
		
		items.remove(go);
		
	}
	
	public GeometricObject [] getObjectbyType(GeometricObject g) {
		
		
		ArrayList<GeometricObject> obj =new ArrayList<GeometricObject>();
		
		for(GeometricObject go : items) {
			
			if(( go.getClass().equals(g.getClass())))  {
				
				obj.add(go);
			}
		}
		
		GeometricObject [] arr =obj.toArray(new GeometricObject[obj.size()]);
		
		return arr;
		
		
	}
	
	public GeometricObject [] getObjectbyArea(String a, double b) {
		
	
		
		ArrayList<GeometricObject> obj =new ArrayList<GeometricObject>();
		
		for(GeometricObject go : items) {
			
			if (a.equals("<")  && go.getArea()<b) {
				
				obj.add(go);
			}else if (a.equals("=")  && go.getArea()==b){
				obj.add(go);
			}else if (a.equals(">")  && go.getArea()>b){
				obj.add(go);
			}else if (a.equals(">=")  && go.getArea()>=b){
				obj.add(go);
			}else if (a.equals("<=")  && go.getArea()<=b){
				obj.add(go);
			}
		}
		
		GeometricObject [] arr =obj.toArray(new GeometricObject[obj.size()]);
		
		return arr;
		
		
	}
	
	public GeometricObject [] getObjectbyPerimeter(String a, double b){
		
		ArrayList<GeometricObject> obj =new ArrayList<GeometricObject>();
		
		for(GeometricObject go : items) {
			
			if (a.equals("<")  && go.getPerimeter()<b) {
				
				obj.add(go);
			}else if (a.equals("=")  && go.getPerimeter()==b){
				obj.add(go);
			}else if (a.equals(">")  && go.getPerimeter()>b){
				obj.add(go);
			}else if (a.equals(">=")  && go.getPerimeter()>=b){
				obj.add(go);
			}else if (a.equals("<=")  && go.getPerimeter()<=b){
				obj.add(go);
			}
		}
		
		GeometricObject [] arr =obj.toArray(new GeometricObject[obj.size()]);
		
		return arr;
		
		
	}
	
	public int deleteObjectbyType(GeometricObject g) {
		
		ArrayList<GeometricObject> obj =new ArrayList<GeometricObject>();
		
		for(Iterator<GeometricObject> iterator = items.iterator(); iterator.hasNext();) {
			GeometricObject go =iterator.next();
			
			if (go.getClass().equals(g.getClass())) {
				
				obj.add(go);
				
				iterator.remove();
			}
		}
		
		GeometricObject [] arr =obj.toArray(new GeometricObject[obj.size()]);
		
		return arr.length;
		
	}
	
	public double deleteObjectbyArea(String a, double b) {
		
		ArrayList<Double> obj =new ArrayList<>();
		
		for(Iterator<GeometricObject> iterator = items.iterator(); iterator.hasNext();) {
			
			GeometricObject go =iterator.next();
			
			if (a.equals("<")  && go.getArea()<b) {
				
				obj.add(go.getArea());
				iterator.remove();
			}else if (a.equals("=")  && go.getArea()==b){
				obj.add(go.getArea());
				iterator.remove();
			}else if (a.equals(">")  && go.getArea()>b){
				obj.add(go.getArea());
				iterator.remove();
			}else if (a.equals(">=")  && go.getArea()>=b){
				obj.add(go.getArea());
				iterator.remove();
			}else if (a.equals("<=")  && go.getArea()<=b){
				obj.add(go.getArea());
				iterator.remove();
			}
		}
		
		double sum = 0;
		for(Double d : obj)
		    sum += d;
		return sum;
		

		
		
		
		
		
		
	}
	
	public double deleteObjectbyPerimeter(String a, double b) {
		
		ArrayList<Double> obj =new ArrayList<>();
		
		for(Iterator<GeometricObject> iterator = items.iterator(); iterator.hasNext();) {
			
			GeometricObject go =iterator.next();
			
			if (a.equals("<")  && go.getPerimeter()<b) {
				
				obj.add(go.getPerimeter());
				iterator.remove();
			}else if (a.equals("=")  && go.getPerimeter()==b){
				obj.add(go.getPerimeter());
				iterator.remove();
			}else if (a.equals(">")  && go.getPerimeter()>b){
				obj.add(go.getPerimeter());
				iterator.remove();
			}else if (a.equals(">=")  && go.getPerimeter()>=b){
				obj.add(go.getPerimeter());
				iterator.remove();
			}else if (a.equals("<=")  && go.getPerimeter()<=b){
				obj.add(go.getPerimeter());
				iterator.remove();
			}
		}
		
		double sum = 0;
		for(Double d : obj)
		    sum += d;
		return sum;
		
	}
}
