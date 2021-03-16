package ro.ase.csie.g1092.refactor.phase3.services;

import ro.ase.csie.g1092.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.g1092.refactor.exceptions.InvalidPriceException;

public interface ValidatorServiceInterface {
	public void  validatePrice(float price) throws InvalidPriceException;
	public void validateAge(int accountAge) throws InvalidAgeException;
}
