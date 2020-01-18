package com.Vishal.PlayGround;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class LaserPrinter implements Printer {

	
	
	public LaserPrinter() {
		System.out.println("Constructing LP");
	}
	
	public void print()
	{
		System.out.println("Laser Printing !!!!");
	}
}
