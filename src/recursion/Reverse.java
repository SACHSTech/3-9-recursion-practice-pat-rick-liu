package recursion;

public class Reverse {
    public static String reverse(String e) {
        if (e.length() <= 1){ 
            return e;
        }else{
            return (e.charAt(e.length() - 1) + reverse(e.substring(0, e.length() - 1)));
            
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("Tabletop")); 
    }
}