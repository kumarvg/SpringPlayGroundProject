package com.Vishal.PlayGround;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value =  "prototype")
public class DotMatrixPrinter implements Printer{

	public DotMatrixPrinter() {
		System.out.println("Constructing DMP");

	}
	
	
	public void print()
	{
		System.out.println("Dot Matrix printing !!!");
	}
}
