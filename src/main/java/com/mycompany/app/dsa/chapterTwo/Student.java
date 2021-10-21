package com.mycompany.app.dsa.chapterTwo;

public class Student implements Person{
String id;
String name;
int age;

public Student(String i, String n, int a){//simple constructor
id = i;
name = n;
age = a;
}
protected int studyHours(){return age/2;} //just a guess
public String getID(){ return id;} //ID of the student
    @Override
    public boolean equals(Person other) { //from Person interface
        // TODO Auto-generated method stub
        if(!(other instanceof Student))return false; // cannot possibly be equal
        Student s = (Student)other; //explicit cast now safe
        return id.equals(s.id); //compare IDs
    }
    public String toString(){
        return "Student(ID:" +id +", Name:" +name + ", Age:"+age+")";
    }

    @Override
    public String getName() { //from Person interface
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return age;
    }    
}
