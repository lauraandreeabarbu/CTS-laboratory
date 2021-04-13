package ro.ase.csie.g1092.dp.decorator;

import ro.ase.csie.g1092.dp.adapter.ACMESuperHero;

public abstract class AbstractDecorator extends ACMESuperHero {

	ACMESuperHero hero = null;
	
	public AbstractDecorator(ACMESuperHero hero) {
		super(hero.name, hero.lifePoints);
		this.hero = hero;
	}

	public void move()
	{
		this.hero.move();
	}
	
	public void crouch()
	{
		this.hero.crouch();
	}
	public void takeAHit(int points)
	{
		this.hero.takeAHit(points);
	}

	public void heal(int points)
	{
		this.hero.heal(points);
	}
}
