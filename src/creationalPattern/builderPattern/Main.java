package creationalPattern.builderPattern;

public class Main {
	public static void main(String[] args) {
		
		Person person = new PersonBuilder()
				.setAge(27)
				.setGender("남자")
				.setHeight(179)
				.setName("윤현구")
				.build();
		System.out.println(person);
		
	}
}
