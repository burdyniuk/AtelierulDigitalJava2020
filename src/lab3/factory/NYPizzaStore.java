package lab3.factory;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {

        if(type.equals("NYMargerita")) {
            return new NYMargerita();
        }
        else if(type.equals("NYQuattro")) {
            return new NYQuattro();
        }

        return null;
    }
}
