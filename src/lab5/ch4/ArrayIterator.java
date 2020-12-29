package lab5.ch4;

public class ArrayIterator<T> implements IArrayIterator<T> {
    T[] elements;
    int iterator = -1;

    public ArrayIterator(T[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        if (iterator < elements.length - 1) {
            if (elements[iterator + 1] != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T next() {
        iterator++;
        return elements[iterator];
    }
}
