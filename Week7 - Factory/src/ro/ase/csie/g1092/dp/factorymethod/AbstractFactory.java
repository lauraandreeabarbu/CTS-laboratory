package ro.ase.csie.g1092.dp.factorymethod;

import ro.ase.csie.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.g1092.dp.simplefactory.WeaponType;

public abstract class AbstractFactory {

	public abstract AbstractWeapon getWeapon(WeaponType type, String description);
}
