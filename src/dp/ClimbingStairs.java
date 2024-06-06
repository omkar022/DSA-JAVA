package dp;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=6;
        System.out.println(ways(n));
    }

    private static int ways(int n) {
        if(n<0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        return ways(n-1)+ways(n-2);
    }
}
