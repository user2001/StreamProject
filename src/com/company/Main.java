package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        /////Task2///////
        List<User> listOfusers = new ArrayList<>();
        listOfusers.add(new User("new@gmail.com", LocalDate.now(), "Alfa"));
        listOfusers.add(new User("old@gmail.com", LocalDate.of(2022, 1, 20), "Beta"));
        listOfusers.add(new User("fryshchyn@gmail.com", LocalDate.of(2021, 12, 29), "Omega"));
        listOfusers.add(new User("nika@gmail.com", LocalDate.of(2022, 1, 15), "Alfa"));
        listOfusers.add(new User("hipster@gmail.com", LocalDate.of(2022, 1, 5), "Omega"));
        listOfusers.add(new User("normal@gmail.com", LocalDate.of(2021, 12, 31), "Alfa"));

        GroupBY list1 = new GroupBY(listOfusers);
        list1.groupByDate();
        list1.groupByName();
        //////Task3////////
        List<Movies> set1 = new ArrayList<>();
        set1.add(new Movies("Ganibal", "horror", 54));
        set1.add(new Movies("How I met your mom", "sitcom", 22));
        set1.add(new Movies("Friends", "sitcom", 34));

        List<Movies> set2 = new ArrayList<>();
        set2.add(new Movies("Royal Treatment", "comedy", 40));
        set2.add(new Movies("Leap Year", "comedy", 36));
        set2.add(new Movies("The Office", "sitcom", 19));
        set2.add(new Movies("Alarm", "horror", 28));

        List<Movies> listOfMoviees = new ArrayList<>();
        listOfMoviees.addAll(set1);
        listOfMoviees.addAll(set2);

        TicketsMenu ticketsMenu = new TicketsMenu(listOfMoviees);
        ticketsMenu.AverageGenrePrice();
        ticketsMenu.getCount();
    }


}
