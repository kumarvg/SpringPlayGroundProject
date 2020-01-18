package com.Vishal.PlayGround;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.Vishal.PlayGround2.MPPConfig;
import com.Vishal.PlayGround2.MultiPurposePrinter;

@SpringBootApplication
@ImportResource("classpath:BeansPrinter.xml")
@ComponentScan(basePackages = "com.Vishal")

public class PlayGroundApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(PlayGroundApplication.class, args);

		System.out.println("-----------------------------Stage One---------------------------------");
		
		  //Printer pt = (Printer) ctx.getBean(DotMatrixPrinter.class);
		  
		 MultiPurposePrinter pt =(MultiPurposePrinter) ctx.getBean("mpp");
		  
		  //MultiPurposePrinter pt2 =(MultiPurposePrinter) ctx.getBean("mpp2");
		  
		  
		  Printer printer = (Printer) ctx.getBean("dotMatrixPrinter");
		  
		  
		  System.out.println("model " + pt.getModel());
		  
		  pt.scaneApp(); 
		  
		  pt.printerApp();
		  
		  
		  
		/*
		 * System.out.println("mpp - " + pt.getPrinter()); System.out.println("mpp2 - "
		 * + pt2.getPrinter()); System.out.println("printer - " + printer);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * pt.print();
		 * 
		 * pt2.print(); pt2.scane();
		 * 
		 * System.out.println(pt.getPrinter()); System.out.println(pt2.getPrinter());
		 */
		 
	}

}
