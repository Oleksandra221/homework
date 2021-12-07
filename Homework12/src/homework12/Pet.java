package homework12;

public class Pet {
	private String name_of_pet;
	private int age_of_pet;
	private String color;
	private String cover;
	private String sound;
	
	Pet(String name_of_pet,  int age_of_pet, String color,String cover, String sound){
		this.age_of_pet = age_of_pet;
		this.color = color;
		this.cover = cover;
		this.name_of_pet = name_of_pet;
		this.sound = sound;
	}
	
	public String getName_of_pet() {
		return name_of_pet;
	}
	public void setName_of_owner(String name_of_owner) {
		this.name_of_pet = name_of_owner;
	}
	public int getAge_of_pet() {
		return age_of_pet;
	}
	public void setAge_of_pet(int age_of_pet) {
		this.age_of_pet = age_of_pet;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
	
}
