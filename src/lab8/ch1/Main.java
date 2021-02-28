package lab8.ch1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    @Test
    public void consumer1() {
        List<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
        Consumer<List<String>> consumer = List::clear;
        consumer.accept(list);
        System.out.println(list);
        if (list.size() == 0){
            System.out.println("0");
        } else {
            System.out.println("1");
        }

        Assert.assertEquals(list, new ArrayList<>());
    }

    @Test
    public void consumer2() {
        List<String> list1 = new ArrayList<String>(Arrays.asList("a","b","c"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("a","b","c","first","second"));

        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> c3 = c1.andThen(c2);
        c3.accept(list1);

        Assert.assertEquals(list1, list2);
    }
}
