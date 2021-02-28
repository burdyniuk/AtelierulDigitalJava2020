package lab6.ch4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 3, 7, 8, 6, 2, 1);

        while (true) {

            int ok = 0;
            // -1 -> < ; 1 -> >
            int comp = -1;

            // validarea datelor
            for (int i = 0; i < list.size() - 1; i++) {
                if (ok == 1)
                    break;

                if (comp == -1) {
                    if (list.get(i) > list.get(i+1))
                        ok = 1;
                    else {
                        comp = 1;
                    }
                }
                else {
                    if (list.get(i) < list.get(i+1))
                        ok = 1;
                    else {
                        comp = -1;
                    }
                }
            }

            if (ok == 1)
                Collections.shuffle(list);
            if (ok == 0)
                break;
        }
        System.out.println(list);
    }
}
