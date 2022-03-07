public class Stock {
  
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock() {
		
	}
	
	public Stock(String newSymbol,String newName) {
		this.symbol=newSymbol;
		this.name=newName;
		
	}
	
	public void setPreviousClosingPrice(double newPreviousClosingPrice) {
		
		this.previousClosingPrice=newPreviousClosingPrice;
		
	}
	
	public double getPreviousClosingPrice() {
		
		return previousClosingPrice;
		
	}
	public void setCurrentPrice(double newCurrentPrice) {
		
		this.currentPrice=newCurrentPrice;
		
	}
	
	public double getCurrentPrice() {
		
		return currentPrice;
		
	}
	
	public double getChangePercent() {
		
		return ((double)(currentPrice-previousClosingPrice)/(double)previousClosingPrice)*100;
	}
