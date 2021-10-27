package com.mycompany.app.dp.creationalPattern.abstractFactoryPattern;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){  
        if(choice.equalsIgnoreCase("Bank")){  
           return new BankFactory();  
        } else if(choice.equalsIgnoreCase("Loan")){  
           return new LoanFactory();  
        }  
        return null;  
     }  
}
