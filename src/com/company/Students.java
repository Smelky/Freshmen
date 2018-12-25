package com.company;

public class Students extends Person {

    int course;
    float average_rating;
    String Accommodation;
    String present;

    Students (String Name, int age, String degree, String character, int course, float average_rating, String Accommodation, String present) {
        super (Name, age, degree, character);
        this.course = course;
        this.average_rating = average_rating;
        this.present = present;
        this.Accommodation = Accommodation;
    }


}
