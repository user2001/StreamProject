package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;

public class TicketsMenu {
    List<Movies> films;

    public TicketsMenu(List<Movies> films) {
        this.films = films;
    }

    public void AverageGenrePrice() {

        Map<String, Double> average = films.stream()
                .collect(Collectors.groupingBy(Movies::getGenre, averagingInt(Movies::getPrice)));
        System.out.println(average);
    }

    public void getCount() {
        Map<String, Long> count = films.stream()
                .collect(Collectors.groupingBy(Movies::getGenre, Collectors.counting()));
        System.out.println(count);

    }
}
