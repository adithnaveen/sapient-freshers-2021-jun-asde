package com.sapient.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.sapient.Exception.ItemEmptyException;
import com.sapient.contracts.IShoppingCart;
import com.sapient.contracts.PaymentStratergy;
import com.sapient.entity.Item;
import com.sapient.payment.BestPayment;
import com.sapient.paymentmethods.CreditCard;
import com.sapient.paymentmethods.UPI;

public class ShoppingCart implements IShoppingCart {

	private List<Item> items;
	private BestPayment bestPayment;

	public ShoppingCart() {
		items = new ArrayList<Item>();
	}

	@Override
	public void addItem(Item item) {
		if (item != null) {
			items.add(item);
		}

	}

	@Override
	public void removeItem(Item item) throws ItemEmptyException {
		if (item != null) {
			items.remove(item);
		}
		throw new ItemEmptyException("Item is Empty");
	}

	@Override
	public void checkOut() {
		PaymentStratergy ps = new BestPayment().bestPay();
		ps.pay(this.calculateTotal(ps));
	}

	@Override
	public int calculateTotal(PaymentStratergy paymentStratergy) {

		int sum = 0;
		for (Item item : items) {
			sum += item.getPrice() * item.getCount();
		}

		if (paymentStratergy instanceof CreditCard) {
			double charges = (CreditCard.getCharges() * sum) / 100;
			System.out.println("Credit Card Charges " + charges);
			sum += charges;
		} else if (paymentStratergy instanceof UPI) {
			double charges = (UPI.getCharges() * sum) / 100;
			System.out.println("UPI Charges " + charges);
			sum += charges;
		}

		return sum;
	}

}
