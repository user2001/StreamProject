package com.company;

import java.time.LocalDate;

public class User  {
    private String email;
    private LocalDate loginDate;
    private String teamName;

    public  String getEmail() {
        return (String) email;
    }

    public  LocalDate getLoginDate() {
        return (LocalDate) loginDate;
    }

    public  String getTeamName() {
        return (String) teamName;
    }

    public User(String email, LocalDate loginDate, String teamName) {
        this.email = email;
        this.loginDate = loginDate;
        this.teamName = teamName;
    }

}
