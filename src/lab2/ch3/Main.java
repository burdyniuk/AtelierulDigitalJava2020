package lab2.ch3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Fluffy");
        Animal animalCat = cat;
        Fish d = new Fish();
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        ((Pet)animalCat).play();
        cat.play();
        cat.walk();
        cat.setName("Felix");
        System.out.println(cat.getName());

        d.eat();
        d.setName("Oscar");
        System.out.println(d.getName());
        d.play();
        d.walk();
        d.eat();

        e.walk();
        e.eat();

        a.eat();
        a.walk();
        ((Fish) a).eat();

        p.play();
        p.setName("Archie");
        System.out.println(p.getName());
        ((Cat) p).walk();
        ((Cat) p).eat();
    }
}
