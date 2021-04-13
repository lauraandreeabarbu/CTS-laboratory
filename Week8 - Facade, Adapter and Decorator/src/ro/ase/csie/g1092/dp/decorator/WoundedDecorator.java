package ro.ase.csie.g1092.dp.decorator;

import ro.ase.csie.g1092.dp.adapter.ACMESuperHero;

public class WoundedDecorator extends AbstractDecorator {

	public WoundedDecorator(ACMESuperHero hero) {
		super(hero);
	}

	@Override
	public void move() {
		if(this.hero.lifePoints > 500)
			this.hero.move();
		else
			System.out.println("the hero is barely moving");
	}

	
}
