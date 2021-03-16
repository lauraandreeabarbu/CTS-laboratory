package ro.ase.csie.g1092.refactor.phase3.services;

import ro.ase.csie.g1092.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.g1092.refactor.exceptions.InvalidPriceException;

public class ValidatorService implements ValidatorServiceInterface{

	public void validatePrice(float price) throws InvalidPriceException
	{
		if(price <=0) {
			throw new InvalidPriceException();
		}
	}
	
	
	public void validateAge(int accountAge) throws InvalidAgeException
	{
		if (accountAge <0) {
			throw new InvalidAgeException();
		}
	}
}
