import java.util.*;
import java.lang.Math;
public class PerfectSquare {
    public static boolean isPerfect(int n){
        if(n>0){
            int x = (int)Math.sqrt(n);
            if(n==Math.pow(x, 2 )){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int n = sc.nextInt();
        if(isPerfect(n)){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Square");
        }   
    }
    
}
