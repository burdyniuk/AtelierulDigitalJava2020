package lab7.ch3;

public class Main {
    public static void main(String[] args) {

        /*
        We know that rock beats scissors
        paper beats rock
        scissors beats paper
         */

        Player p1 = new Player("Ilie");
        Player p2 = new Player("Cezar");

        p1.run();
        p2.run();

        String op1 = p1.getCurrentChoice();
        String op2 = p2.getCurrentChoice();
        System.out.println(p1.getPlayerName() + " chose: " + op1);
        System.out.println(p2.getPlayerName() + " chose: " + op2);
        System.out.println("----- Results -----");

        if(op1.equals("rock")) {
            if(op2.equals("paper")) {
                System.out.println(p2.getPlayerName() + " is the winner !");
            }
            else if(op2.equals("scissors")) {
                System.out.println(p1.getPlayerName() + " is the winner !");
            }
            else {
                System.out.println("It's a tie ");
            }
        }
        else if(op1.equals("paper")) {
            if(op2.equals("scissors")) {
                System.out.println(p2.getPlayerName() + " is the winner !");
            }
            else if(op2.equals("rock")) {
                System.out.println(p1.getPlayerName() + " is the winner !");
            }
            else {
                System.out.println("It's a tie ");
            }
        }
        else if(op1.equals("scissors")){
            if(op2.equals("rock")) {
                System.out.println(p2.getPlayerName() + " is the winner !");
            }
            else if(op2.equals("paper")) {
                System.out.println(p1.getPlayerName() + " is the winner !");
            }
            else {
                System.out.println("It's a tie ");
            }
        }
    }
}
