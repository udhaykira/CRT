import java.util.*;
class StrPalindrome {
    public static boolean isPalindrome(String s){
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return reverse.equals(s);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "A man, a plan, a canal: Panama";
        Boolean res = isPalindrome(s);
        if(res){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}