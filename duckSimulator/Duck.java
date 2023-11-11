package duckSimulator;
public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public Duck() {
        /*
         * Each duck object will set behavior variables type (not a concrete class
         * Implementation).
         * set these bahavior variable polymorphically to reference that specific
         * behavior type, at runtime.
         */
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        /* 
         * delegate behavior to the object referenced by quackBehavior.
         */
        quackBehavior.quack();
    }

    void setFlyBehavior(IFlyBehavior fb){
        flyBehavior = fb;
    }

    void setQuakcBehavior(IQuackBehavior qb){
        quackBehavior = qb;
    }
}

/* Behaviors */

class FlywithWings implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am Flying!!!");
    }

}

class FlyNoWay implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("can't fly ????");
    }

}

class FlyRockerPowered implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!!");
    }

}

class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Rubber duckey Quack!!!");
    }

}

class MuteQuack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("can't Quack ????");
    }

}

class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!!");

    }
}
