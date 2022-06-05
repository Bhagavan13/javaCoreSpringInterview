package com.bhagavan.interview.transactionalUnd;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

	private static Map<String,Double> hmap = new HashMap<String,Double>();
	
	static
	{
		hmap.put("acc1", 10000.0);
		hmap.put("acc2", 7000.0);
		hmap.put("acc1", 12000.0);
		hmap.put("acc1", 18000.0);
	}
	
	public static boolean validateFaretoBalance(String accountNo,double Ticketfare) throws InsufficientException
	{
		boolean status=false;
		if(Ticketfare>hmap.get(accountNo))
		{
			throw new InsufficientException("NO sufficient balance to book");
		}
		else
		{
			status=true;
		}
		return status;
	}
	
}
