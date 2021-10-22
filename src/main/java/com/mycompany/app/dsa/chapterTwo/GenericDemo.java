package com.mycompany.app.dsa.chapterTwo;

public class GenericDemo {
    public  static <T> void reverse(T[] data) {
        int low = 0, high = data.length -1;
        while(low < high){ //swap data[low] and data[high]
            T temp = data[low];
            data[low++] = data[high]; //post-increment of low
            data[high--] = temp; //post-decrement of high
        }
    }
    public static void main(String[] args){
        String[] s = {"Sunil", "Kamal","Anil","Ranil"};
        GenericDemo.reverse(s);
        for(int i=0; i < s.length; i++){
            System.out.println(s[i]);

        }
    }
}
