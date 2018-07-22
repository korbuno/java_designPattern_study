package creationalPattern.abstractFactoryPattern;

public class UnitFactory {
	public static Unit getUnit(AbstractUnitFactory unit) {
		return unit.createUnit();
	}
}
