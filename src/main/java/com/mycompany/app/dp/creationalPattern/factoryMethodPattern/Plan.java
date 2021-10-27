package com.mycompany.app.dp.creationalPattern.factoryMethodPattern;

public abstract class Plan{  
    protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
}//end of Plan class.  