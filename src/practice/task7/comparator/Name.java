package practice.task7.comparator;

import practice.task7.Chat;

import java.util.Comparator;

public class Name implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
