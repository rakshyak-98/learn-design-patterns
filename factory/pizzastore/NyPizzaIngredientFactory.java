package factory.pizzastore;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new RegggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
        
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

}