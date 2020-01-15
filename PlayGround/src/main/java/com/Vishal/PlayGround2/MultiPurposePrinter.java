package com.Vishal.PlayGround2;

import com.Vishal.PlayGround.Printer;
import com.Vishal.PlayGround.Scanner;

public class MultiPurposePrinter {

	private Printer printer;
	private Scanner scanner;

	// constructer representation
	
    public MultiPurposePrinter() {
		System.out.println("default constructor mpp");
	}
	
	
	
    public static MultiPurposePrinter getObj() {
		System.out.println("MPP factory called, creating MPP");
		MultiPurposePrinter mpp = new MultiPurposePrinter();
		mpp.setModel("SMA");
		System.out.println("model " + mpp.getModel());
		return mpp;
		
	}
    
	/*
	 * private MultiPurposePrinter(Printer printer, Scanner scanner) { super();
	 * System.out.println("Constructor called"); this.printer = printer;
	 * this.scanner = scanner;}
	 */
	 
	  
	/*
	 * public MultiPurposePrinter(Scanner scanner) { super();
	 * System.out.println("scanner Constructor called"); this.scanner = scanner; }
	 */
	 

	
	   public Scanner getScanner() { return scanner; }
	  
	  public void setScanner(Scanner scanner) { this.scanner = scanner; }
	 
	  
	  
	  void init() {
		  System.out.println("Initialized after creation");
	  }
	
	  
	  void des() {
		  System.out.println("destroying");
	  }
	
	
	public Printer getPrinter() { return printer; } public void
	  setPrinter(Printer printer) { this.printer = printer; }
	 
	
	
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	/*
	 * public void print() { System.out.println("Model " + model); printer.print();
	 * }
	 */

	public void scaneApp() {
		scanner.scan();
	}
	
	public void printerApp() {
		printer.print();
	}
	
	
	

}
