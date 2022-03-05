package com.thinkitive.spring;

public class Atm {
	public Atm() {
		// TODO Auto-generated constructor stub
	}

	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void printername(String print) {
		getPrinter().printerName(print);
	}

}
