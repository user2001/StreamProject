package com.company;

public class Movies {
    private String name;
    private String genre;
    private int price;

    public Movies(String name, String genre, int price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
}
