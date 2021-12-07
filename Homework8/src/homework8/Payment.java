package homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Payment {
	Scanner in = new Scanner(System.in);
	
	private double sum = 0.0;
	private Products p = new Products();
	
	public double sumToPay() {
		for (Map.Entry<String, Double> entry : p.products.entrySet()) {
			System.out.println("The key is: " + entry.getKey() + " the value is " + entry.getValue());
			sum+=entry.getValue();
		}
		System.out.println("The sum to pay: " + sum);
		return sum;
	}
	
	public class Products{
		Map<String, Double> products = new HashMap<String, Double>();
		
		private void addProduct() {
			System.out.println("Write down a name of a product.");
			String product = in.nextLine();
			System.out.println("Write down a cost of a product.");
			double cost = Double.parseDouble(in.nextLine());
			products.put(product, cost);	
		}
		
		public void createList() {
			boolean end = true;
			while(end) {
				System.out.println("To exit type - false, to add product type - t");
				String end_str = in.nextLine();
				if (end_str.equalsIgnoreCase("false")) {
					end = false;
				} else {
					addProduct();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment pay = new Payment();
	    pay.p.createList();
	    pay.sumToPay();
	}

}
