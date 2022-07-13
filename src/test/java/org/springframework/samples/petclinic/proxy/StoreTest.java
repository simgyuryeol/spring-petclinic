package org.springframework.samples.petclinic.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
	@Test
	public void tsetPay(){
		Payment payment = new CreditCard();
		Store store = new Store(payment);
		store.buySomething(101);
	}
}
