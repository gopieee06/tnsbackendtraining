package com.tns.interfacedemo;

//Samsung phone which implements Phones
public  class Samsung implements Phones {
	
	@Override
	public void Phone(String model) {
		System.out.println("Brand name of the Phone is " + model + ".");
		System.out.println("Screen Type is Super Amoled.");
		System.out.println("Processor is Snapdragon / Exynose.");
		if (model == "s21" || model == "s21fe" || model == "s21ultra"  ||
				model == "s22" || model == "s22fe" || model == "s22ultra" ||
				model == "s23" || model == "s23plus" || model == "s23fe" || model == "s23ultra" ||
				model == "s24" || model == "s24plus" || model == "s24fe" || model == "s24ultra" ||
				model == "s25" || model == "s25plus" || model == "s25fe" || model == "s25ultra" ) {
			System.out.println("Samsung " + model + "is Good Flagship killer phone.");
		}
		else {
			System.out.println("Smasung " + model + " is a flagship & good performance centric phone.");
		}
		
	}


}
