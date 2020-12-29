package lab5.ch2;

public class ShoesDontMatch extends Exception {
    public ShoesDontMatch() {
        super("Wrong pair, they must have same color and size!");
    }
}
