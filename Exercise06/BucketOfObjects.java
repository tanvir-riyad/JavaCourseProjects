import java.util.ArrayList;
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
	            
		
		
		return a;
	
	
}
	
	public void removeObject(GeometricObject go) {
		
		items.remove(go);
		
	}
}
