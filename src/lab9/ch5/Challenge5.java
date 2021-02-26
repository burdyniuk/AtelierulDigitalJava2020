package lab9.ch5;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class Challenge5 {
    public static List<String> words1 = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static List<String> words2 = Arrays.asList("the", "quick", "brown", "fox", "jumped", "over",
            "the", "lazy", "dog");

    static Flux<String> createFlux(List<String> list) {
        return Flux.fromIterable(list);
    }

    static Flux<String> mergeFluxWithNoInterleave(Flux<String> flux1, Flux<String> flux2) {
        return Flux.merge(flux1, flux2);
    }

    static Flux<String> mergeFluxWithInterleave(Flux<String> flux1, Flux<String> flux2) {
        return Flux.mergeSequential(flux1, flux2);
    }

    static Flux<String> createFluxFromMultipleMono(Mono<String> mono1, Mono<String> mono2) {
        return Flux.concat(mono1, mono2);
    }

}
