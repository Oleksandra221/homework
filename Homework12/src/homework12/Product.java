package homework12;

public class Product {
	private double cost_of_toy;
	private String manufacturer_country;
	
	Product(){
		
	}
	
	Product(double cost_of_toy, String manufacturer_country){
		this.cost_of_toy = cost_of_toy;
		this.manufacturer_country = manufacturer_country;
	}
	
	@Override 
	public String toString() {
		return "Cost is " + this.cost_of_toy + ", manufacturer country is " + manufacturer_country;
	}
	public double getCost_of_toy() {
		return cost_of_toy;
	}

	public void setCost_of_toy(double cost_of_toy) {
		this.cost_of_toy = cost_of_toy;
	}

	public String getManufacturer_country() {
		return manufacturer_country;
	}

	public void setManufacturer_country(String manufacturer_country) {
		this.manufacturer_country = manufacturer_country;
	}
	

}
