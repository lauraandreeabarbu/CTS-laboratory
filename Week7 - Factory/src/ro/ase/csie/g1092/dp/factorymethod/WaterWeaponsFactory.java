package ro.ase.csie.g1092.dp.factorymethod;

import ro.ase.csie.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.g1092.dp.simplefactory.WeaponType;
import ro.ase.csie.g1092.dp.simplefactory.WeaponsFactory;

public class WaterWeaponsFactory extends AbstractFactory {

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String description) {

		AbstractWeapon weapon = null;
		switch(type)
		{
		case PISTOL:
			weapon = new WaterPistol();
			break;
		case MACHINE_GUN:
			weapon = new WaterBalloon();
			break;
		case BAZOOKA:
			weapon = new WaterBucket();
			break;
			
		}
		return null;
	}


}
