package hashing;

import java.util.HashMap;

public class ItineraryTickets {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Bengaluru");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi", "Goa");

        String start = journeyPath(hm);
        System.out.print(start);
        for (String key : hm.keySet()) {
            System.out.print("->" + hm.get(start));
            start = hm.get(start);
        }
        System.out.println();
    }

    public static String journeyPath(HashMap<String, String> hm) {
        HashMap<String, String> rm = new HashMap<>();

        for (String key : hm.keySet()) {
            rm.put(hm.get(key), key);
        }
        for (String key : hm.keySet()) {
            if (!rm.containsKey(key)) {
                return key;
            }
        }
        return null;
    }


}
