package com.spring.service.impl;

import com.spring.service.PrintService;

public class FirstPrint implements PrintService {

	@Override
	public void print() {
		System.out.println("PrintService by FirstService");
		
	}

}
