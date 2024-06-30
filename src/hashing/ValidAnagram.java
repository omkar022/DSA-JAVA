package hashing;

import java.nio.charset.CharacterCodingException;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="race";
        String t="care";
        System.out.println(anagram(s,t));
    }

    private static boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer>hm=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            hm.put(ch1,hm.getOrDefault(ch1,0)-1);
        }

        for (int key:hm.values()){
           if(key!=0){
               return false;
           }
        }
        return true;

    }
}
