package projects_patterns.creational.factory;

public class NewGeep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 10km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 50 sec");
    }
}
