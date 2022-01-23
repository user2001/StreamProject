package com.company;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupBY {
    List<User> users;

    public GroupBY(List<User> users) {
        this.users = users;
    }

    public void groupByName() {
        Map<String, Set<String>> map = users.stream()
                .collect(Collectors.groupingBy(User::getTeamName, Collectors.mapping(User::getEmail, Collectors.toSet())));
        System.out.println(map);
    }

    public void groupByDate() {
        Set<String> map2 = users.stream()
                .filter(it -> it.getLoginDate().isBefore(LocalDate.now().minusWeeks(1)))
                .map(User::getEmail).collect(Collectors.toSet());
        System.out.println(map2);
    }

}

