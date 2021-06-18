package com.sapient.client;

import com.sapient.contracts.IShoppingCart;
import com.sapient.entity.Item;
import com.sapient.shoppingcart.ShoppingCart;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
	public static void main(String[] args) {
		IShoppingCart cart = new ShoppingCart(); 

		cart.addItem(new Item("Mobile", 3000, 2));
		cart.addItem(new Item("TV", 2000, 4));
		cart.addItem(new Item("Monitor", 600, 1));
		
		cart.checkOut(); 
		
	}
}
