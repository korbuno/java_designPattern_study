package creationalPattern.builderPattern;

public class Person {

	private String name;
	private String gender;
	private int height;
	private int age;
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getHeight() {
		return height;
	}
	public int getAge() {
		return age;
	}
	public Person(String name, String gender, int height, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", height=" + height + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
}
