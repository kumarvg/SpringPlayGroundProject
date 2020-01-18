package com.Vishal.PlayGround;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//blueScanner
public class BlueScanner implements Scanner {

	public BlueScanner() {
		System.out.println("Constructing Blue Scanner");

	
	}
	
	public void scan() { 
		System.out.println("Blue Scanner !!! ");
	}
}
