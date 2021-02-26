package lab9.ch5;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Main {
    public static void main(String[] args) {
        Flux<String> flux1 = Challenge5.createFlux(Challenge5.words1);
        Flux<String> flux2 = Challenge5.createFlux(Challenge5.words2);

        Flux<String> newFlux = Challenge5.mergeFluxWithNoInterleave(flux1, flux2);
        newFlux.subscribe(System.out::println);

        System.out.println("\n");

        newFlux = Challenge5.mergeFluxWithInterleave(flux1, flux2);
        newFlux.subscribe(System.out::println);

        System.out.println("\n");

        Mono<String> mono1 = Mono.just("Hello, ");
        Mono<String> mono2 = Mono.just("world!");
        newFlux = Challenge5.createFluxFromMultipleMono(mono1, mono2);
        newFlux.subscribe(System.out::print);
    }
}
