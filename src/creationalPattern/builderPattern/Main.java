package creationalPattern.builderPattern;

public class Main {
	public static void main(String[] args) {
		PersonBuilder personBuilder = new PersonBuilder();
		
		Person person = personBuilder
				.setAge(27)
				.setGender("남자")
				.setHeight(179)
				.setName("윤현구")
				.build();
		System.out.println(person);
	}
}
