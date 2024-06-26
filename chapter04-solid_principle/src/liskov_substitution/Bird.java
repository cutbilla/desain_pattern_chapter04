package liskov_substitution;

abstract class Bird {
    public abstract void move();
}

class Sparrow extends Bird {
    @Override
    public void move() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Penguin is swimming");
    }
}
