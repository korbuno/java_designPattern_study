package creationalPattern.abstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		Unit marine1 = UnitFactory.getUnit(new BarrackFactory("마린1", 50));
		Unit marine2 = UnitFactory.getUnit(new BarrackFactory("마린2", 50));
		Unit marine3 = UnitFactory.getUnit(new BarrackFactory("마린3", 50));
		Unit wraith1 = UnitFactory.getUnit(new StarportFactory("레이스1", 125));
		Unit wraith2 = UnitFactory.getUnit(new StarportFactory("레이스2", 125));
		Unit wraith3 = UnitFactory.getUnit(new StarportFactory("레이스3", 125));
		
		System.out.println(marine1.toString());
		System.out.println(marine2.toString());
		System.out.println(marine3.toString());
		System.out.println(wraith1.toString());
		System.out.println(wraith2.toString());
		System.out.println(wraith3.toString());
	}
}
