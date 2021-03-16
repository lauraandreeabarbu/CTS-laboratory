package ro.ase.csie.g1092.refactor.phase3;

import java.nio.channels.UnsupportedAddressTypeException;

import ro.ase.csie.g1092.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.g1092.refactor.phase3.services.Marketing2021Strategy;
import ro.ase.csie.g1092.refactor.phase3.services.MarketingServiceInterface;

public class Product {
	
	MarketingServiceInterface mkService = null;
	
	public Product(MarketingServiceInterface mkService)
	{
		//if(mkService == null)
		//{
		//	throw new NullPointerException();
		//}
		//this.mkService = mkService;
		this.setMarketingService(mkService);
	}
	
	//optional - based on design specs
	private void setMarketingService(MarketingServiceInterface mkService) {
		if(mkService == null)
		{
			throw new NullPointerException();
		}
		this.mkService = mkService;
	}

	public static float getDiscountValue(float price, float discount)
	{
		return discount * price;
	}
	
	private static float getPriceWithDiscountAndFidelity(
			float price, float discountValue, float fidelityDiscount)
	{
		return (price - discountValue) * (1 - fidelityDiscount);
	}

	
	
	private static float getFinalPrice(
		float price, float fidelityDiscount, ProductType type)
	{
		float discountValue = getDiscountValue(price, type.getDiscount());
		float finalPrice = getPriceWithDiscountAndFidelity(price, discountValue, fidelityDiscount);
		return finalPrice;
	}
	
	
	
	public float computePriceWithDiscount(ProductType productType, float price, int accountAge) throws InvalidPriceException, InvalidAgeException
	  {
		
		if (price <=0)
		{
			throw new InvalidPriceException();
		}
		if (accountAge <0)
		{
			throw new InvalidAgeException();
		}
		
		float fidelityDiscount =
				(productType == ProductType.NEW)? 0 : mkService.getFidelityDiscount(accountAge); 
		
		float finalPrice = getFinalPrice(price, fidelityDiscount, productType);
		
	  /*  float discountValue=0;
	    
	    switch(productType)
	    {
	    case NEW:
	    	finalPrice =getFinalPrice(finalPrice,fidelityDiscount, productType.NEW);
	    	break;
	    case DISCOUNTED:
	    	finalPrice =getFinalPrice(finalPrice,fidelityDiscount, productType.DISCOUNTED);
	    	break;
	    	
	    case LIMITED_STOCK:
	    	finalPrice =getFinalPrice(finalPrice,fidelityDiscount, productType.LIMITED_STOCK);
	    	break;
	    case LEGACY:
	    	finalPrice =getFinalPrice(finalPrice,fidelityDiscount, productType.LEGACY);
	    	break;
	 	default:
	 		throw new UnsupportedOperationException("The enum type is not created");
	    }
	    */
	    
	    return finalPrice;
	  }
}