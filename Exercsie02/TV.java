public class TV {
  
  int channel;
	int volumeLevel;
	boolean on;
	public TV() {
			
	}
	public void turnOn() {
		
		on=true;
	}
	public void turnOff() {
		
		on=false;
		
	}
	public boolean isOn() {
		return on;
	}
	public void setChannel(int newChannel) {
		
		if (newChannel>1 && newChannel< 120 && on ==true) {
			this.channel=newChannel;
			
		}
		
	}
	public int getChannel() {
		return channel;
	}
	public void setVolume(int newVolume) {
		
		if (newVolume >1 && newVolume< 10 && on ==true) {
			this.volumeLevel=newVolume;
			
		}
		
	}
	public int getVolume() {
		return volumeLevel;
	}
	
	public void channelUp() {
		 
		if(channel >=1 && channel <= 120 && on==true ) {
				channel++;
				
		}
		
	}
	public void channelDown() {
		if (channel >1 && channel < 120 && on ==true) {
			channel--;
		}
		
	}
	public void volumeUp() {
		if (volumeLevel >1 && volumeLevel < 10 && on ==true) {
			volumeLevel++;
		}
		
	}
	
	public void volumeDown() {
		if (volumeLevel >1 && volumeLevel < 10 && on ==true) {
			volumeLevel--;
		}
		
	}
}
