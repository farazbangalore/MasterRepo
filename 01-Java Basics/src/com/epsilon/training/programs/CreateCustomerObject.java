package com.epsilon.training.programs;

import com.epsilon.training.entity.Customer;

public class CreateCustomerObject {
	public static void main(String[] args) {
		
		// Variable declaration
		//c1 is a reference type variable
		//c1 gets 8 bytes in stack
		//At this time, the class Customer is not loaded to VM yet!
		Customer c1;
		
		//For this statement to work, the class "Customer" must be loaded to VM
		// Objects are in Heap ALWAYS in JAVA
		// The new keyword allocates the memory required by the customer object(sum of 
		//bytes required by customer class)
		//Once the allocation is done, it calls the constructor specified.
		//It records the actual address against the reference number, which is then collected and stored by c1
		c1= new Customer();
		
		c1.setId(1);
		c1.setName("Faraz Hussain");
		c1.setEmail("farazhussain5554@gmail.com");
		c1.setPhone("9513154984");
		
		System.out.println(c1);
	}

}
