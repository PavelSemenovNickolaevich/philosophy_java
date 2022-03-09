package jdbc.starter;

public class User {

    public int id;
    static public int count;

    public User() {
        this.id = count;
        count++;
    }

    public void info() {
        System.out.println("id = " + id);
    }
}
