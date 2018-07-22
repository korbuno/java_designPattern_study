package creationalPattern.builderPattern;

public class PersonBuilder {

	private String name;
	private String gender;
	private int height;
	private int age;
	
	public Person build() {
		return new Person(name, gender, height, age);
	}
	
	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PersonBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public PersonBuilder setHeight(int height) {
		this.height = height;
		return this;
	}
	public PersonBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	
}
