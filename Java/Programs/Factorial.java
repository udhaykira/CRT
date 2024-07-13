import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int fact = 1;
        if(n==1){
            System.out.println("Factorial of 1 is 1");
        }
        for(int i=n;i>1;i--){
            fact = fact*n;
            n=n-1;
        }
        System.out.println("Factorial of "+temp+" is "+fact);           
    }
    
}
