package bitmanipulation;

public class EvenOdd {
    public static void main(String[] args) {
        int res = 5;
        if ((res & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
