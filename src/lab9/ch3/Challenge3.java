package lab9.ch3;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {
    private List<String> words = Arrays.asList("the", "quick", "brown", "fox",
            "jumped", "over", "the", "lazy", "dog");

    public void displayLetters() {
        Flux.fromIterable(words).flatMap(word -> Flux.fromArray(word.split("")))
                .subscribe(System.out::println);
    }

    public void sortLetters() {
        Flux.fromIterable(words).flatMap(word -> Flux.fromArray(word.split(""))).sort().distinct()
                .subscribe(System.out::println);
    }

//    public void missingLetters() {
//        Flux<String> manyLetters = Flux.fromIterable(words).flatMap(word -> Flux.fromArray(word.split("")))
//                .distinct().sort().zipWith()
//    }
}
