package lab6.ch2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> toReturn = new ArrayList<Integer>();

        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it2 = list2.iterator();


        Integer current1 = it1.next();
        Integer current2 = it2.next();
        while (it1.hasNext() && it2.hasNext()) {
            if (current1.compareTo(current2) < 0) {
                toReturn.add(current1);
                current1 = it1.next();
            } else {
                toReturn.add(current2);
                current2 = it2.next();
            }
        }

        while (it1.hasNext()) {
            toReturn.add(it1.next());
        }

        while (it2.hasNext()) {
            toReturn.add(it2.next());
        }

        return toReturn;
    }

    public static void main(String[] args) {

    }
}
