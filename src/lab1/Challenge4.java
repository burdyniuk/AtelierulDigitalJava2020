package lab1;

public class Challenge4 {
    public static void main(String[] args) {
        int[] numbers = {-1,-1,-1,2};
        int numOfPairs = 0;

        for (int i = 0; i < numbers.length; i++){
            for (int j = i+1; j < numbers.length; j++)
                for (int k = j+1; k < numbers.length; k++)
                    if (numbers[i] + numbers[j] + numbers[k] == 0){
                        numOfPairs++;
                        numbers[j] = 123456789;
                        numbers[k] = 123456789;
                    }
        }

        System.out.println(numOfPairs);
    }
}
