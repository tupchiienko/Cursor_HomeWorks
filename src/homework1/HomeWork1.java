package homework1;

import java.util.Arrays;
import java.util.Collections;

public class HomeWork1 {
    public static void main(String[] args) {

        System.out.println("1. DESC sorting.");

        Integer[] integerArray = {2, 3, 1, 7, 11};

        System.out.println("Source array: " + Arrays.toString(integerArray));
        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println("Sorted DESC: " + Arrays.toString(integerArray));

        System.out.println("\n2. Sum of positive numbers.");

        integerArray = new Integer[]{2, 3, 1, 7, 11, -2, -5, -1};

        System.out.println("Numbers: " + Arrays.toString(integerArray));

        int sum = 0;

        for (Integer integer : integerArray) {
            if (integer > 0) {
                sum += integer;
            }
        }

        System.out.println("Sum of positive: " + sum);

        System.out.println("\n3. Get average of numbers.");

        integerArray = new Integer[]{1,2,4,1};

        System.out.println("Numbers: " + Arrays.toString(integerArray));

        int avg = 0;
        for (Integer integer : integerArray) {
            avg += integer;
        }
        avg /= integerArray.length;

        System.out.println("Average: " + avg);

        System.out.println("\n4. Replace duplicates by 0.");

        integerArray = new Integer[]{3, 2, 3, 1, 4, 2, 8, 3};

        System.out.println("Source array: " + Arrays.toString(integerArray));

        for (int i = 0; i < integerArray.length; i++) {
            for (int j = i + 1; j < integerArray.length; j++) {
                if (integerArray[i].equals(integerArray[j])) {
                    integerArray[j] = 0;
                }
            }
        }

        System.out.println("Replaced by zeros: " + Arrays.toString(integerArray));
    }
}
