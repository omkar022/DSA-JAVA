package recursion;

public class FriendsPairing {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countPairing(n));
    }

    private static int countPairing(int n) {
        if (n <= 2) {
            return n;
        }
        return countPairing(n - 1) + (n - 1) * countPairing(n - 2);
    }
}
