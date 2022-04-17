package com.mycompany.app.dp.behaviouralPattern.chainOfResponsibilityPattern;


public class ErrorBasedLogger extends Logger {
	
	
	public ErrorBasedLogger(int levels) {
		// TODO Auto-generated constructor stub
		this.levels=levels;
	}

	
	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		
		System.out.println("ERROR LOGGER INFO: "+msg);
	}
	

}