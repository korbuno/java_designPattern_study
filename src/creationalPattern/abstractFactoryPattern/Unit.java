package creationalPattern.abstractFactoryPattern;

public abstract class Unit {

	public abstract String getName();
	public abstract int getPrice();
	
	@Override
	public String toString() {
		return "유닛 명 : " + getName() + ", 가격 : " + getPrice();
	}
	
}
