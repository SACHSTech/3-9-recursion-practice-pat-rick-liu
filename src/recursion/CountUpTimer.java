package recursion;

public class CountUpTimer {
    public static void countUp(int n) {
        if (n == 0){ 
            System.out.println(n);
        }else{
            countUp(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        countUp(5); // Output: 1 2 3 4 5
    }
    // comment
}