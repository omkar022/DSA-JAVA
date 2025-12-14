package interview;

import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;
import  java.util.stream.*;

public class FlattenArray2 {
    public static void main(String[] args) {
        // Example nested list
//        List<List<Integer>> nestedList = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5),
//                Arrays.asList(6, 7, 8, 9)
//        );

        // Flatten the list
//        List<Integer> flatList = flattenList(nestedList);

        // Print the flattened list
//        System.out.println(flatList);
//        List<List<Integer>>list=Arrays.asList(
//                Arrays.asList(1,2,3),
//                Arrays.asList(4,5)
//        );
//        List<Integer>ans=list.stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(ans);
        List<List<Integer>>list=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4,5));
        List<Integer>ans=list.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(ans);

    }

//    public static List<Integer> flattenList(List<List<Integer>> nestedList) {
//        List<Integer> flatList = new ArrayList<>();
////        for (List<Integer> subList : nestedList) {
////            flatList.addAll(subList);
////        }
//        for(List<Integer>list:nestedList){
//            flatList.addAll(list);
//        }
//        return flatList;
//    }
}

