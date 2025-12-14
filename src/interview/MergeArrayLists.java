package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrayLists {
    public static void main(String[] args) {
        // Create three ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(4, 5, 6));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(7, 8, 9));

        // Merge the three lists using Stream
//        List<Integer> mergedList = Stream.of(list1, list2, list3)
//                                         .flatMap(List::stream)
//                                         .collect(Collectors.toList());
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

//List<Integer>list=nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        // Print the merged list
        List<Integer>list=nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Merged List: " + list);
    }
}
