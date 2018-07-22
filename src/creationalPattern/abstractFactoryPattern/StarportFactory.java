package creationalPattern.abstractFactoryPattern;

public class StarportFactory implements AbstractUnitFactory {

	private String name;
	private int price;

	public StarportFactory(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public Unit createUnit() {
		return new StarportUnit(name, price);
	}

}
