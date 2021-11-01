package org.example.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercises {

    public void exercise1(){

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

    public void exercise2(){

        ArrayList<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        for (String s : week) {
            System.out.println(s);

        }
    }
    public void exercise2a(){
        ArrayList<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        for (String s : week) {
            System.out.println(s);

        }
    }

    public void exercise3(){
        ArrayList<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        week.add(3,"Thursday");

        System.out.println(week);



    }

    public void exercise4(){
        ArrayList<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        ArrayList<String> newWeek = new ArrayList<>(week.subList(0,3));


        System.out.println(newWeek);

    }

    public void exercise5(){

        HashSet<String> week = new HashSet<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        System.out.println(week);
    }

    public void exercise6(){

        HashSet<String> week = new HashSet<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        ArrayList<String> weekArrayList
                =  new ArrayList<>(week);

        System.out.println(weekArrayList);

    }







}
