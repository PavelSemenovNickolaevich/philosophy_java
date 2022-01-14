package practice.task7.subtask;

import java.util.List;

public class Chat2 {

    private String name;
    private List<User> users;

    public Chat2(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Chat2{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
