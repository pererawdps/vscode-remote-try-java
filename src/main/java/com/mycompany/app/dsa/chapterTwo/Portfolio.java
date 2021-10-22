package com.mycompany.app.dsa.chapterTwo;

public class Portfolio<T> {
    T[] data;
    public Portfolio(int capacity){
        //data = new T[capacity]; //illegal; compiler error
        data =(T[]) new Object[capacity]; //legal, but compiler warning
    }
    public T get(int index){ return data[index];}
    public void set (int index, T element){ data[index] = element; }
    
   public static void main(String[] args) {
      Portfolio p = new Portfolio<String>(5);
      p.set(0, "Apple");
      p.set(1, "Banana");
      System.out.println(p.get(0));
      Portfolio p2 = new Portfolio<Double>(5);
      p2.set(0, 11.25);
      p2.set(1,10.50);
      System.out.println(p2.get(0));

  }
}
