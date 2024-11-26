package recursion;

public class Palindrome {
    public static boolean isPalindrome(String e) {
        if (e.length() <= 1){ 
            return true;
        }
        if(e.charAt(e.length()-1) != e.charAt(0)){
            return false;
        }
        return isPalindrome(e.substring(1,e.length() - 1));
        
        
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); 
        System.out.println(isPalindrome("raceecar"));
        System.out.println(isPalindrome("racipcar"));
    }
}
