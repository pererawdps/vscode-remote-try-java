package com.mycompany.app.dsa.chapterTwo;

public class Photograph implements Sellable{
private String descript; // description of this photo
private int price; // the price we are setting
private boolean color; //true if photo is in color

public Photograph(String desc, int p, boolean c){//constructor
    descript = desc;
    price = p;
    color = c;
}
    @Override
    public String description() {
        // TODO Auto-generated method stub
        return descript;
    }

    @Override
    public int listPrice() {
        // TODO Auto-generated method stub
        return price;
    }

    @Override
    public int lowestPrice() {
        // TODO Auto-generated method stub
        return price/2;
    }

    public boolean isColor(){
        return color;
    }
    
}
