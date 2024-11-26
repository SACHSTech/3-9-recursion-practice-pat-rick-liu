package recursion;

public class ToBinary {
    public static String toBinary(int n){
        if(n / 2 == 0){
            return "1"; 
        }else{
            return toBinary(n/2) + n % 2 ;
        }
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10));
        System.out.println(toBinary(1)); 
        System.out.println(toBinary(2));  
        System.out.println(toBinary(30)); 
    }
}
