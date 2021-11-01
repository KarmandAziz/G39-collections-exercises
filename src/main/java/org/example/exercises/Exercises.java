package org.example.exercises;

import java.util.*;

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

    public void exercise7(){

        HashSet<String> names = new HashSet<>();
        names.add("Karmand");
        names.add("Nils");
        names.add("Ulf");
        names.add("Hanna");
        names.add("Amanda");
        names.add("Patricia");

        ArrayList<String> namesArrayList = new ArrayList<>(names);

        Collections.sort(namesArrayList);

        System.out.println(namesArrayList);


    }

    public void exercise8(){
        HashSet<String> names = new HashSet<>();
        names.add("Karmand");
        names.add("Nils");
        names.add("Ulf");
        names.add("Hanna");
        names.add("Amanda");
        names.add("Patricia");

        TreeSet<String> namesSorted = new TreeSet<>(names);

        //TreeSet is sorted

        System.out.println(namesSorted);
    }

    public void exercise9to11(){

        HashMap<Integer, String> cars = new HashMap<>();

        cars.put(1,"Mercedes");
        cars.put(2, "Volkswagen");
        cars.put(3, "Bentley");
        cars.put(4, "Ford");
        cars.put(5, "Volvo");
        //exercise9
        System.out.println(cars);
        //exercise10
        System.out.println(cars.values());
        //exercise11
        System.out.println(cars.keySet());

    }

    public void exercise12(){

        HashMap<Integer, Car> cars = new HashMap<>();

        cars.put(1,new Car(1, "Volvo", "XC60"));
        cars.put(2,new Car(2, "Audi", "RS7"));
        cars.put(3,new Car(3,"Mercedes", "GLC"));


        System.out.println(cars.get(1).getBrand());
        System.out.println(cars.get(2).getBrand());
        System.out.println(cars.get(3).getBrand());




    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void challenge1(){
        Set<String> wholeWeek = new HashSet<>();
        wholeWeek.add("Monday");
        wholeWeek.add("Tuesday");
        wholeWeek.add("Wednesday");
        wholeWeek.add("Thursday");
        wholeWeek.add("Friday");
        wholeWeek.add("Saturday");
        wholeWeek.add("Sunday");

        Set<String> weekend = new HashSet<>();
        weekend.add("Saturday");
        weekend.add("Sunday");


        wholeWeek.retainAll(weekend);

        System.out.println(wholeWeek);

    }

    public void challenge2(){

        HashMap<String, String> user = new HashMap<>();
        user.put("Karmand94@gmail.com", "Karmand");

        HashSet<Set<String>> users = new HashSet<>();
        users.add(user.keySet());

        System.out.println(users);

    }

    public void challenge3(){

        List<SuperHero> hero = new ArrayList<>(Arrays.asList(
                new SuperHero(1,"Karmand", 27),
                new SuperHero(2, "Arne", 55),
                new SuperHero(3, "Sven", 65),
                new SuperHero(3, "Matilda", 23)
        ));

        hero.sort(Comparator.comparing(SuperHero::getAge));
        loop(hero);




    }
    public void loop(List<SuperHero> superHumanList){
        for(SuperHero superHero : superHumanList){
            System.out.println(superHero);
        }
    }





}
