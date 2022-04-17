package com.mycompany.app.dp.creationalPattern.singletonPatternExample.ealyInstantiation;

public class A{  
    private static A obj=new A();//Early, instance will be created at load time  
    private A(){}  
      
    public static A getA(){  
     return obj;  
    }  
     
    public void doSomething(){  
    //write your code  
    }  
    public static void main(String[] args) {
        A a; 
        A b;
        a = A.getA();
        b = A.getA();
        System.out.println(a.equals(b));
    }
   }  
