package lab3.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        if(type.equals("CHMargerita")) {
            return new CHMargerita();
        }

        else if(type.equals("CHQuattro")) {
            return new CHQuattro();
        }


        return null;
    }
}
