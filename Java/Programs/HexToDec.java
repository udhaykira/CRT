import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a.toUpperCase();
        int val=0;
        for(int i=a.length();i>=0;i--){
            String str = "0123456789ABCDEF";
            char ch = a.charAt(i);
            int digit = str.indexOf(ch);
            val  = digit*

        }
    }
    
}
