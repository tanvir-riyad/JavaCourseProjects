public class Fan {
	
	private static final int SLOW=1;
	private static final int MEDIUM=2;
	private static final int FAST=3;
	
	private int speed;
	
	private boolean on;
	
	private double radius;
	
	private String color;
	
	public Fan() {
		
		speed=SLOW;
		on=false;
		radius=5;
		color="blue";
				
	}
	
	public void setSpeed(int speed) {
		
		this.speed=speed;
	}
	
	public int getSpeed() {
		
		return speed;
		
		
	}
	
	public void setOn(boolean on) {
		
		this.on=on;
	}
	
	public boolean isOn() {
		
		return on;
	}
	
	public void setRadius(double radius) {
		
		this.radius=radius;
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	public void setColor(String color) {
		
		this.color=color;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public String toString() {
		
		if(this.isOn()==true && this.getSpeed()==1) {
			
			return "fan speed is slow, fan color is "+ this.getColor()+", fan radius is "+this.getRadius();
		}
		else if(this.isOn()==true && this.getSpeed()==2) {
			
			return "fan speed is medium, fan color is "+ this.getColor()+", fan radius is "+this.getRadius();
			
		}
		else if(this.isOn()==true && this.getSpeed()==3) {
			
			return "fan speed is fast, fan color is "+ this.getColor()+", fan radius is "+this.getRadius();
			
		}
		else if(this.isOn()==false) {
			
			return "fan color is "+ this.getColor()+", fan radius is "+this.getRadius() +", fan is off";
		}
		
		else {
			return "invalid entry";
		}
			
		
	}
}
