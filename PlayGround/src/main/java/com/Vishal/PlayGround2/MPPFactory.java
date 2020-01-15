package com.Vishal.PlayGround2;

public class MPPFactory {
	
	public MPPFactory() {
		System.out.println("Constructing MPPFactory");
	}
	
	public  MultiPurposePrinter getObj() {
		System.out.println("MPP factory bean called, creating MPP");
		MultiPurposePrinter mpp = new MultiPurposePrinter();
		mpp.setModel("SMA");
		System.out.println("model " + mpp.getModel());
		return mpp;
		
	}
	

}
