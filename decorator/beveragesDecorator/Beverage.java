package decorator.beveragesDecorator;

/* 
 * Beverage is a abstract calls, subclassed by all beverages offered
 * in the coffee shop.
 */
public abstract class Beverage {
    /**
     * set in each subclass and holds a description of the beverage
     */
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    /**
     * need to define their own implementation 
     */
    public abstract double cost();
}

abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
