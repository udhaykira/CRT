import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int rev = 0;
        while(n>0){
            sum = n%10;
            rev = rev*10+sum;
            n = n/10;
        }
        if(temp==rev){
            System.out.println(temp+" is Palindrome");
        }
        else{
            System.out.println(temp+" is not a Palindrome");
        }
    }
}
