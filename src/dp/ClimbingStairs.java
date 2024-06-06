package dp;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=60;
        int memo[]=new int[n+1];
        System.out.println(ways(n,memo));
    }

    private static int ways(int n,int memo[]) {
        if(n<0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        if(memo[n]!=0){
            return memo[n];
        }
        memo[n]= ways(n-1,memo)+ways(n-2,memo);
        return memo[n];
    }
}
