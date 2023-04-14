package projects_patterns.creational.object_pool;

public class Resources {

    Resources() {
        System.out.println("Open resourses");
    }

    public Resources opeation1() {
        System.out.println("Operation1");
        return this;
    }

    public Resources opeation2() {
        System.out.println("Operation2");
        return this;
    }

    void close() {
        System.out.println("free resources");
    }
}
