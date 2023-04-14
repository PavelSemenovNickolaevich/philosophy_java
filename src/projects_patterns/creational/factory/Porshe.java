package projects_patterns.creational.factory;

public class Porshe implements Car{
    @Override
    public void drive() {
        System.out.println("Drive speed 100km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 10 sec");
    }
}
