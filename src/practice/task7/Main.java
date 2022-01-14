package practice.task7;


import practice.task7.comparator.Name;
import practice.task7.comparator.UsersAndName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {


        List<Chat> chatList = new ArrayList<>( Arrays.asList(
                new Chat("Parents", 4000),
                new Chat("Wupils", 1006),
                new Chat("Pork", 1001),
                new Chat("Home", 103),
                new Chat("Home", 4000)
        ));

      //  System.out.println(getLess100(chatList));
        getLess100(chatList);
        System.out.println(chatList);

        chatList.sort(new UsersAndName());
        System.out.println(chatList);

        chatList.sort(new Name());
        System.out.println(chatList);

    }

    static void getLess100(List<Chat> chatList) {

        ListIterator<Chat> listIterator = chatList.listIterator();
        while(listIterator.hasNext()) {
            Chat chatNext = listIterator.next();
            if (chatNext.getUsers() < 1000) {
                listIterator.remove();
            }
        }
       // chatList.removeIf(chatNext -> chatNext.getUsers() < 1000);
    }
}
