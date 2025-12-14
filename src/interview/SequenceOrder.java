package interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SequenceOrder {
    public static void main(String[] args) {
        // Define the lists
//        List<List<String>> lists = Arrays.asList(
//                Arrays.asList("a", "b", "c", "d"), // ascending
//                Arrays.asList("z", "x", "y"),      // unordered
//                Arrays.asList("z", "x")           // descending
//        );
//
//        // Check each list and determine its order
//        for (List<String> list : lists) {
//            String result = determineOrder(list);
//            System.out.println("List: " + list + " is " + result);
////        }
//        List<List<String>>lists= Arrays.asList(Arrays.asList("a,b,c"),
//                Arrays.asList("z","a","x"),Arrays.asList("z","x"));
//        for(List<String>list:lists){
//            String s=determineOrder(list);
//            System.out.println(list+ " "+s);
//        }
        List<List<String>>lists=Arrays.asList(Arrays.asList("A","B","C"),Arrays.asList("Z","X"),Arrays.asList("A","X","J"));
        for (List<String>list:lists) {
            String ans=determine(list);
            System.out.println(ans);
        }

    }

    private static String determine(List<String> list) {
        boolean asc=true;
        boolean desc=true;
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).compareTo(list.get(i-1))>0){
                desc=false;
            }
            else if(list.get(i).compareTo(list.get(i-1))<0){
                asc=false;
            }

        }
        if (asc){
            return "Asc";
        }
        else if(desc){
            return "desc";
        }
        else {
            return "unorder";
        }
    }

//    private static String determineOrder(List<String> list) {
//        boolean asc=true;
//        boolean desc=true;
//
//        for (int i = 1; i <list.size() ; i++) {
//            if(list.get(i).compareTo(list.get(i-1))>0){
//                desc=false;
//            }
//            else if(list.get(i).compareTo(list.get(i-1))<0){
//                asc=false;
//            }
//
//        }
//        if (asc){
//            return "asc";
//        } else if (desc) {
//            return "Dec";
//        }else{
//            return "unorderd";
//        }
//    }
}

//    public static String determineOrder(List<String> list) {
//        boolean isAscending = true;
//        boolean isDescending = true;
//
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i).compareTo(list.get(i - 1)) > 0) {
//                isDescending = false;
//            } else if (list.get(i).compareTo(list.get(i - 1)) < 0) {
//                isAscending = false;
//            }
//
//        }
//
//        if (isAscending) {
//            return "ascending";
//        } else if (isDescending) {
//            return "descending";
//        } else {
//            return "unordered";
//        }
//    }
//}
