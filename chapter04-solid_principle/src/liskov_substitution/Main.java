package liskov_substitution;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.move(); // Output: Sparrow is flying
        penguin.move(); // Output: Penguin is swimming
    }
}
