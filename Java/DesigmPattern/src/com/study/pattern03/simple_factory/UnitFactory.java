package com.study.pattern03.simple_factory;

enum UnitType {
	Marine, Firebat, Medic
}

public class UnitFactory {
	public static Unit createUnit(UnitType type) {
		Unit unit = null;

		switch (type) {
		case Marine:
			unit = new Marine();
			break;
		case Firebat:
			unit = new Firebat();
			break;
		case Medic:
			unit = new Medic();
			break;
		}
		return unit;
	}

}
