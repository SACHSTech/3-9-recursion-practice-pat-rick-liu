package recursion;

public class EvenNumbersInRange {
    public static void printEvens(int start, int end) {

        if (start > end){
        }else{
            if (end % 2 == 0){
                System.out.println(end);
                printEvens(start, end - 2);
            }else{
                System.out.println(end - 1);
                printEvens(start, end - 3);
            }
            
        }
    }

    public static void main(String[] args) {
        printEvens(5, 10); 
    }

}
