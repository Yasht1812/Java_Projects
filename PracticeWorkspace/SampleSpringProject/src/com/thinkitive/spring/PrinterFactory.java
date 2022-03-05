package com.thinkitive.spring;

public class PrinterFactory {
	
	public static Printer getPrinter() {
		return new Printer();
	}
}
