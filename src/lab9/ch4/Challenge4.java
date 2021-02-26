package lab9.ch4;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Challenge4 {
    static Mono<User> capitalizeOne(Mono<User> mono) {
        mono.map(o->o.firstName.substring(0, 1).toUpperCase()+o.firstName.substring(1)).subscribe(System.out::println);
        mono.map(o->o.lastName.substring(0, 1).toUpperCase()+o.lastName.substring(1)).subscribe(System.out::println);
        mono.map(o->o.username.substring(0, 1).toUpperCase()+o.username.substring(1)).subscribe(System.out::println);
        return mono;
    }

    static Flux<User> capitalizeMany(Flux<User> flux) {
        Flux<User> newFlux = Flux.from(flux);
        newFlux.map(User::getFirstName).map(o->o.substring(0,1).toUpperCase()+o.substring(1))
                .subscribe(System.out::println);
        newFlux.map(User::getLastName).map(o->o.substring(0,1).toUpperCase()+o.substring(1))
                .subscribe(System.out::println);
        newFlux.map(User::getUsername).map(o->o.substring(0,1).toUpperCase()+o.substring(1))
                .subscribe(System.out::println);
        return newFlux;
    }

    static Flux<User> asyncCapitalizeMany(Flux<User> flux) {
        flux.flatMap(Challenge4::asyncCapitalizeUser).subscribe(Challenge4::printUser);
        return null;
    }

    static void printUser(User u) {
        System.out.println(u.firstName + " " + u.lastName + " " + u.username);
    }

    static Mono<User> asyncCapitalizeUser(User u) {
        return Mono.just(new User(u.getFirstName().toUpperCase(), u.getLastName().toUpperCase(),
                u.getUsername().toUpperCase()));
    }
}
