package com.mycompany.app.dsa.chapterTwo;

public interface Insurable extends Sellable,Transportable{
    /** Returns insured value in cents */
    public int insuredValue();
}
