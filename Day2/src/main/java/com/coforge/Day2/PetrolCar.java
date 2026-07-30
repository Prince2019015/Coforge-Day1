package com.coforge.Day2;

public interface PetrolCar {
	
	public default void provideAC(){
		System.out.println("Petrol Car provides normal AC ");
	}

}