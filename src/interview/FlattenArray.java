package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlattenArray {
//    public static List<Object> flatten(Object[] array) {
//        List<Object> result = new ArrayList<>();
//        Stream.of(array).forEach(item -> {
//            if (item instanceof Object[]) {
//                result.addAll(flatten((Object[]) item));
//            } else {
//                result.add(item);
//            }
//        });
//        return result;
//    }
    public static List<Object> flatten(Object[]arr){
//        List<Object>res=new ArrayList<>();
//        Stream.of(arr).forEach(item->{
//            if(item instanceof Object[]){
//                res.addAll(flatten((Object[])item));
//            }else{
//                res.add(item);
//            }
//        });
//        Stream.of(arr).forEach(i->
//        {
//            if(i instanceof Object[]){
//                res.addAll(flatten((Object[])i));
//            }else{
//                res.add(i);
//            }
//        });

//        Stream.of(arr).forEach(item->{
//            if(item instanceof Object[]){
//                res.addAll(flatten((Object[]) item));
//            }else{
//                res.add(item);
//            }
//        });
//        List<Object>res=new ArrayList<>();
//        Stream.of(arr).forEach(i->{
//           if(i instanceof Object[]){
//               res.addAll(flatten((Object[])i));
//           }else{
//               res.add(i);
//           }
//        });
        List<Object>list=new ArrayList<>();
        Stream.of(arr).forEach(input->{
            if(input instanceof Object[]){
                list.addAll(flatten((Object[])input));
            }else{
                list.add(input);
            }
        });
        return list;
    }

    public static void main(String[] args) {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}};
        System.out.println(flatten(array));
    }
}
