package com.mycompany.app.dsa.chapterTwo;

public class ObjectPair {
    Object first;
    Object second;
    public ObjectPair(Object a, Object b){
        first = a;
        second = b;
    }
    public Object getFirst(){return first;}
    public Object getSecond(){return second;}

    public static void main(String[] args) {
        ObjectPair bid = new ObjectPair("ORCL", 32.07);

        // String stock =bid.getFirst(); //illegal; compile error
        String stock = (String)bid.getFirst(); // narrowing cast: Object to String
    }
}
