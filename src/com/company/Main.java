package com.company;

import java.util.Scanner;

import static com.company.Professor.Prof;

public class Main {


    public static void main(String[] args) {
        String[] choose = new String[] {""} ;
            String[] check = new String[] {""} ;


                Prof.say ("Professor say: Hello students.");
                System.out.println ("Students: Good morning Professor.");
                Prof.say ("Professor: Lets start attendance Check."+"\n");

            Professor.attendance_Check (check);

                    Prof.say ("\n"+"Professor: You guys have to choose your headman.");
                    System.out.println ("Students: It should be a student with an average grade point bigger than 4. "+"\n"+
                                        "The candidate must be also live in the " +Group.Criteria2+" and be a " +Group.Criteria+", so lets vote."+"\n");


         Group.Starosta (choose);


    }
}