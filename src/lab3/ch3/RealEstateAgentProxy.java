package lab3.ch3;

import java.util.ArrayList;

public class RealEstateAgentProxy {
    ArrayList<Apartment> apartments = new ArrayList<Apartment>();

    void represent(Apartment apartment) {
        this.apartments.add(apartment);
    }

    Apartment rent(Student student) {
        if (!student.name.startsWith("P")) {
            for (Apartment apart : this.apartments) {
                if (apart.monthlyRentCost <= student.money) {
                    return apart;
                }
            }
        }

        return null;
    }
}
