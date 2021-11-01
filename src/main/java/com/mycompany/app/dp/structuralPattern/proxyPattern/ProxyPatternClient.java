package com.mycompany.app.dp.structuralPattern.proxyPattern;


public class ProxyPatternClient {
	
	public static void main(String[] args) 
	{
		OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
		
		access.grantInternetAccess();
	}


}
