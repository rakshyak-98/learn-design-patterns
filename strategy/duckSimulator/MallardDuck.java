package duckSimulator;
public class MallardDuck extends Duck {
    public MallardDuck() {
        /*
         * this is implementation. We are setting teh behavior class, by instantiating.
         * we could easily change that at runtime.
         */
        quackBehavior = new Quack();
        flyBehavior = new FlywithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallerd duck");
    }
}
