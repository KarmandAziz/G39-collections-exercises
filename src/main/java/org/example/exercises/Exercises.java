package org.example.exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercises {

    public void example1(){

        ArrayList<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        System.out.println(week);


    }

    public void example2(){

        ArrayList<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        Iterator itr = week.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }








}
