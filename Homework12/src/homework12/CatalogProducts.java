package homework12;

public class CatalogProducts {
	private String name;
	private double cost;
	private double rating;
	
	CatalogProducts(){
		
	}
	
	
	@Override
	public String toString() {
		return "name=" + name + ", cost=" + cost + ", rating=" + rating;
	}


	public CatalogProducts(String name, double cost, double rating) {

		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
