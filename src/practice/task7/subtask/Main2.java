package practice.task7.subtask;



import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        List<Chat2> chatList = new ArrayList<>(Arrays.asList(
                new Chat2("Parents", Arrays.asList(new User(1, "Test", 43), new User(2, "vasia", 34))),
                new Chat2("Home", Arrays.asList(new User(4, "Test", 23), new User(6, "vasia", 19))),
                new Chat2("Test", Arrays.asList(new User(2, "Test", 18), new User(3, "vasia", 10))),
                new Chat2("War", Arrays.asList(new User(1, "Test", 17), new User(1, "vasia", 34)))
        ));

        System.out.println(chatList);

      //  System.out.println(getList18(chatList));

        List<User> test = getList18(chatList);
        System.out.println(test);
        averageAge(chatList, test);

        System.out.println(getAv(chatList));
    }

    static List<User> getList18(List<Chat2> chatList) {
        List<User> userList = null;
        List<User> newList = new ArrayList<>();
        ListIterator<Chat2> listIterator = chatList.listIterator();
        while (listIterator.hasNext()) {
            Chat2 chatNext = listIterator.next();
            userList = chatNext.getUsers();
            for (User users : userList) {
                if (users.getAge() > 18) {
                   newList.add(users);
                }
            }
        }
       // System.out.println(newList);
        return newList;
    }

    static void averageAge(List<Chat2> chatList, List<User> userList) {
        List<User> newList = new ArrayList<>();
        ListIterator<Chat2> listIterator = chatList.listIterator();
        while (listIterator.hasNext()) {
            Chat2 chatNext = listIterator.next();
            userList = chatNext.getUsers();
            for (User users : userList) {
                {
                    newList.add(users);
                }
            }
        }
//        List<User> finalUserList = userList;
//        newList.removeIf(user -> finalUserList.stream().anyMatch(m ->m.getAge() == user.getAge()));
        newList.removeAll(userList);

        System.out.println(newList);

    }

    static double getAv(List<Chat2> chatList) {
        List<User> userList = null;
        int av = 0;
        List<Integer> newList = new ArrayList<>();
        ListIterator<Chat2> listIterator = chatList.listIterator();
        while (listIterator.hasNext()) {
            Chat2 chatNext = listIterator.next();
            userList = chatNext.getUsers();
            for (User users : userList) {
                if (users.getAge() < 18) {
                    newList.add(users.getAge());
                }
            }
        }
        for (int num : newList) {
            av += num;
        }
        return (double) av/newList.size();
    }
}
