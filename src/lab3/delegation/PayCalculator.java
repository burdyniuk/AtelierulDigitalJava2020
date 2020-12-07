package lab3.delegation;

public class PayCalculator {

    public int calculate(String position) {

        if (position.equals("pos1")) {
            return 2000;
        } else if (position.equals("manager")) {
            return 3000;
        }
        return 1000;
    }
}
