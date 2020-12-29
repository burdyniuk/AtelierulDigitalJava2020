package lab5.ch3;

import java.util.LinkedList;

public class GenericList<T> implements IGenericList<T> {
    LinkedList<T> list = new LinkedList<>();

    public GenericList(T rootValue) {
        list.add(rootValue);
    }

    @Override
    public void insert(T element) {
        list.add(element);
    }

    @Override
    public void println() {
        System.out.println(list.toString());
    }
}
