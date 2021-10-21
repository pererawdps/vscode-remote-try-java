package com.mycompany.app.dsa.chapterTwo;

public class ExampleCatchingExc{
    public static void main(String[] args) {
        int n ;
        try{
            n = Integer.parseInt(args[0]);
            if(n <= 0){
                System.out.println("n must be possitive. Using Default.");
                n = 0;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("NO arguement specified for n. Using default");;

        }
        catch(NumberFormatException e){
            System.out.println("Invalid integer arguement. Using default");
        }


    }
}