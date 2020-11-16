package lab1;

public class Challenge2 {
    String compute(int number){
        String inString = String.valueOf(number);
        String toReturn = new String();

        if (number % 3 == 0)
            toReturn += "Foo";
        if (number % 5 == 0)
            toReturn += "Bar";
        if (number % 7 == 0)
            toReturn += "Qix";

        for (int i = 0; i < inString.length(); i++) {
            if (inString.charAt(i) == '3')
                toReturn += "Foo";
            if (inString.charAt(i) == '5')
                toReturn += "Bar";
            if (inString.charAt(i) == '7')
                toReturn += "Qix";
        }

        if (toReturn.length() == 0)
            toReturn = String.valueOf(number);
        return toReturn;
    }

    String compute2(int number){
        String inString = String.valueOf(number);
        String toReturn = new String();

        if (number % 3 == 0)
            toReturn += "Foo";
        if (number % 5 == 0)
            toReturn += "Bar";
        if (number % 7 == 0)
            toReturn += "Qix";

        for (int i = 0; i < inString.length(); i++) {
            if (!(toReturn.contains("Foo") || toReturn.contains("Bar") ||
                    toReturn.contains("Qix")))
                if (inString.charAt(i) != '0')
                    toReturn += inString.charAt(i);
            if (inString.charAt(i) == '3')
                toReturn += "Foo";
            if (inString.charAt(i) == '5')
                toReturn += "Bar";
            if (inString.charAt(i) == '7')
                toReturn += "Qix";
            if (inString.charAt(i) == '0')
                toReturn += "*";
        }

        if (toReturn.length() == 0)
            toReturn = String.valueOf(number);
        return toReturn;
    }

    public static void main(String[] args) {
        System.out.println("Challenge 2");
        Challenge2 comp = new Challenge2();
        for (int i = 1; i <= 100; i++)
            System.out.println(comp.compute(i));

        System.out.println(comp.compute2(10101));
    }
}
