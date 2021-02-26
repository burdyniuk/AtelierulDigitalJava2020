package lab9.ch4;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Main {
    public static void main(String[] args) {
        User user = new User("ilie", "burdiniuc", "burdyniuk");
        Mono<User> mono = Mono.just(user);
        Mono<User> newMono = Challenge4.capitalizeOne(mono);
        newMono.map(User::getFirstName).subscribe(System.out::println);
        User user1 = new User("dan", "nichiforeac", "butovskiii");
        User user2 = new User("cezar", "almaz", "almaz");

        Flux<User> flux = Flux.just(user, user1, user2);
        Flux<User> newFlux = Challenge4.capitalizeMany(flux);
        //newFlux.map(User::getFirstName).subscribe(System.out::println);

        Challenge4.asyncCapitalizeMany(flux);

    }
}
