package com.Vishal.PlayGround2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.Vishal.PlayGround.BlueScanner;
import com.Vishal.PlayGround.DotMatrixPrinter;
import com.Vishal.PlayGround.Printer;
import com.Vishal.PlayGround.Scanner;

@Configuration
public class MPPConfig {
	
	//<bean id ="printer" class ="com.Vishal.PlayGround.DotMatrixPrinter" ></bean>
	 
	 
	/*
	 * //Id = dotMatrixPrinter;
	 * 
	 * @Bean(name = "printer")
	 * 
	 * @Scope(value = "prototype")
	 * 
	 * @Lazy public Printer dotMatrixPrinter() { return new DotMatrixPrinter(); }
	 */
	
	/*
	 * @Bean(name= "scanner") public Scanner blueScanner() { return new
	 * BlueScanner(); }
	 */
	
	@Bean()
	public MPPFactory mppf()
	{
		return new MPPFactory();
	}
	
	
	/*
	 * @Bean( initMethod = "init" , destroyMethod = "des")
	 * 
	 * @Primary public MultiPurposePrinter mpp(@Qualifier("dotMatrixPrinter")
	 * Printer printer , Scanner scanner , MPPFactory mppF) { MultiPurposePrinter
	 * mpp = mppF.getObj(); mpp.setPrinter(printer); mpp.setScanner(scanner);
	 * mpp.setModel("SAMSUMG"); return mpp; }
	 */




}
