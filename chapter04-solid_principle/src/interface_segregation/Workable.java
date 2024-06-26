package interface_segregation;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Developer implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Developer is coding.");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating.");
    }
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}
