package com.company;

import java.util.Scanner;

public class Person {
    String Name;
    int age;
    String degree;
    String character;


    void say (String str){
        System.out.println(str);
    }

    Person (String Name, int age, String degree, String character ) {
        this.age = age;
        this.degree = degree;
        this.Name = Name;
        this.character = character;



    }

    Person () {}

}



