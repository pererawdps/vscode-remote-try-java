package com.mycompany.app.dsa.chapterTwo;

public class TestProgression {
   public static void main(String[] args) {
       Progression prog;
       //test ArithmeticProgression
       System.out.print("Arithmetic progression with default increment:");
       prog = new ArithmeticProgression();
       prog.printProgression(10);
       System.out.print("Arithmetic progression with default increment 5:");
       prog = new ArithmeticProgression(5);
       prog.printProgression(10);
       System.out.print("Arithmetic progression with start 2:");
       prog = new ArithmeticProgression(5,2);
       prog.printProgression(10);
       //test GeometricProgression
       System.out.print("Geometric progression with base 3:");
       prog = new GeometricProgression(3);
       prog.printProgression(10);
       //test Fibonaccirogression
       System.out.print("Fibonnaci progression with default start values:");
       prog = new FibonacciProgression();
       prog.printProgression(10);
       System.out.print("Fibonnaci progression with start values 4 and 6:");
       prog = new FibonacciProgression(4,6);
       prog.printProgression(8);

       
   } 
}
