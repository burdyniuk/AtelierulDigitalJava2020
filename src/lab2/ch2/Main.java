package lab2.ch2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990,
                actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01,
                actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01,
                actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010,
                actorFaraPremii03});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02,
                actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        ArrayList<String> oscaruri = new ArrayList<>();
        ArrayList<String> filme = new ArrayList<>();
        ArrayList<String> actor50 = new ArrayList<>();

        for (Studio studio : studioDatabase) {
            if (studio.getFilme().length > 2){
                if (!filme.contains(studio.getNume())) {
                    filme.add(studio.getNume());
                }
            }
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getNume().equals("actor cu 2 oscaruri")) {
                        if (!oscaruri.contains(studio.getNume())) {
                            oscaruri.add(studio.getNume());
                        }
                    }
                    if (actor.getVarsta() > 50) {
                        if (!actor50.contains(studio.getNume())) {
                            actor50.add(studio.getNume());
                        }
                    }
                }
            }
        }
        System.out.println("A publicat peste 2 filme: " + filme);
        System.out.println("Contine actor cu 2 oscaruri: " + oscaruri);
        System.out.println("Contine actor cu varsta peste 50: " + actor50);
    }
}
