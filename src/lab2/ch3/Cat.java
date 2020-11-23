package lab2.ch3;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Play like a cat " + name + ".");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" like a cat.");
    }
}
