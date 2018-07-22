package creationalPattern.abstractFactoryPattern;

public class BarrackFactory implements AbstractUnitFactory {

	private String name;
	private int price;

	public BarrackFactory(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public Unit createUnit() {
		return new BarrackUnit(name, price);
	}
}
