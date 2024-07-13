import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        ArrayList<String> s1 = new ArrayList<>(a);
        ArrayList<String> s2 = new ArrayList<>(b);
        String str1 = Collections.sort(s1);
        String str2 = Collections.sort(s2);
        if(str1.equals(str2)){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}