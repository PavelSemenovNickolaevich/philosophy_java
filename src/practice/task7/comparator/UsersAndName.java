package practice.task7.comparator;

import practice.task7.Chat;

import java.util.Comparator;

public class UsersAndName implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        if (o1.getUsers() != o2.getUsers()) {
            return Integer.compare(o2.getUsers(), o1.getUsers());
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
