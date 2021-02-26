package lab9.ch1;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Challenge1 {
    public Flux<String> emptyFlux() {
        return Flux.empty();
    }

    public Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

    public Flux<String> errorFlux() {
        return Flux.error(new Exception());
    }
}
