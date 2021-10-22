package com.mycompany.app.dsa.chapterTwo;

public class Pair <A,B>{
    A first;
    B second;
    public Pair(A a, B b){
        first = a;
        second = b;
    }
    public A getFirst(){ return first;}
    public B getSecond(){return second;}

    public static void main(String[] args) {
        Pair<String,Double> bid;
        bid = new Pair<>("ORCL", 32.07); //rely on type inference
        String stock = bid.getFirst();
        double price = bid.getSecond();
        
    }
    
}
