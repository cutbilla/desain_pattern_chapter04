package interface_segregation;

public class Main {
    public static void main(String[] args) {
        Workable developer = new Developer();
        developer.work();

        Eatable eatableDeveloper = (Eatable) developer;
        eatableDeveloper.eat();

        Workable robot = new Robot();
        robot.work();
    }
}
