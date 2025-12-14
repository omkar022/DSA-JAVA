package interview;

import java.util.Arrays;

public class FlattenArray3 {
    public static void main(String[] args) {
        // Example array of arrays
        Integer[][] nestedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Flatten the array using streams
//        Integer[] flatArray = Arrays.stream(nestedArray)
//                .flatMap(Arrays::stream)
//                .toArray(Integer[]::new);
Integer []flatArray=Arrays.stream(nestedArray).flatMap(Arrays::stream).toArray(Integer[]::new);
//Arrays.stream(nestedArray).flatMap(Arrays::stream).toArray(Integer[]::new);
        // Print the flattened array
        System.out.println(Arrays.toString(flatArray));
    }
}
