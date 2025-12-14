package interview;

public class LCS {
    public static void main(String[] args) {
        String s="abc";
        perm(s,"");
    }

    private static void perm(String s, String ans) {
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            String ns=s.substring(0,i)+s.substring(i+1);
            perm(ns,ans+ch);
        }
    }
}
