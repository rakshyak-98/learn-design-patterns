package factory.pizzastore;

import java.util.ArrayList;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /* 
     * this suer class uses this method to get the instance.
     */
    protected abstract Pizza createPizza(String type);
}

abstract class SimplePizzaFactory {
}

interface IPizza{
   void prepare(); 
   void bake();
   void cut();
   void box();
}

abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for(String i : toppings) System.out.println(i);
    }

    /* 
     * do not make it public.
     */
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut (){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
    
}


class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else return null;
    }

}

class NYStyleCheesePizza extends Pizza{ 
    public NYStyleCheesePizza(){
        name = "NY Style sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza(){
        name = "NY Style Clam pizza";
        sauce = "Marinara Sauce extra clam";
        toppings.add("Grated Reggiano cheese");
        toppings.add("Tomato");
        toppings.add("Onion");
    }
    void bake(){
        System.out.println("Bake for 45 minutes at 350");
    }
 }

class Main{
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        System.out.println();
        nyPizzaStore.orderPizza("clam");
    }
}