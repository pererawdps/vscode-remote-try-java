package com.mycompany.app.dp.creationalPattern.singletonPatternExample.lazyInstantiation;

public class A{  
    private static A obj ;
    private A(){}  
      
    public static A getA(){  
      if (obj == null){  
         synchronized(A.class){  
           if (obj == null){  
               obj = new A();//instance will be created at request time  
           }  
       }              
       }  
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
