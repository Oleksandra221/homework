package homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mobile {
	Scanner in = new Scanner(System.in);
	private String phone_firm;
	private String mobile_model;
	private String mobile_color;
	private MobileInfo mobile_info = new MobileInfo();
	
	Mobile(){
		
	}
	Mobile(String firm, String model, String color){
		this.mobile_color = color;
		this.mobile_model = model;
		this.phone_firm = firm;
	}
	public String getPhone_firm() {
		return phone_firm;
	}

	public void setPhone_firm(String phone_firm) {
		this.phone_firm = phone_firm;
	}

	public String getMobile_model() {
		return mobile_model;
	}

	public void setMobile_model(String mobile_model) {
		this.mobile_model = mobile_model;
	}

	public String getMobile_color() {
		return mobile_color;
	}

	public void setMobile_color(String mobile_color) {
		this.mobile_color = mobile_color;
	}
	
	public class MobileInfo{
		Map<String, String> info = new HashMap<String, String>();
		
		public void addInformation() {
			System.out.println("Write down the information about " + phone_firm + ", " + mobile_model );
			info.put(phone_firm + ", " + mobile_model + ", " + mobile_color, in.nextLine());
		}
	}
	
	public void innit() {
		mobile_info.addInformation();
	}
	
	public void display() {
		for (Map.Entry<String, String> entry : mobile_info.info.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile1 = new Mobile("Samsung", "Galaxy S21", "pink");
		mobile1.innit();
		mobile1.display();
	}

}
