package com.mycompany.app.dsa.chapterTwo;

public class GeometricProgression extends Progression{
    protected long base;

    /** Constructs progression 1,2,3,4,5,16,... */
    public GeometricProgression(){ this(2,1);} //start at 1 with base of 2

    /** Construts progression 1,b,b^2,b^3,b^4,... for base b. */
    public GeometricProgression(long b){ this(b,1);} //start at 1

    /** Constructs geometric progression with arbitary base and start */
    public GeometricProgression(long b, long start){
        super(start);
        base = b;
    }

    /**Multiples the current value by the geometric base. */
    protected void advance(){
        current *= base; //multiply current by the geometric base
    }
}
