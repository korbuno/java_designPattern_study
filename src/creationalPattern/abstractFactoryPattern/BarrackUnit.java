package creationalPattern.abstractFactoryPattern;

public class BarrackUnit extends Unit {

	private String name;
	private int price;

	public BarrackUnit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
