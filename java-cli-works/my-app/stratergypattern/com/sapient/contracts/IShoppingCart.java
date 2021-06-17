package com.sapient.contracts;

import com.sapient.Exception.ItemEmptyException;
import com.sapient.entity.Item;

public interface IShoppingCart {	
	void addItem(Item item); 
	void removeItem(Item item) throws ItemEmptyException; 
	void checkOut();
	
	int calculateTotal(PaymentStratergy paymentStratergy); 
	
}
