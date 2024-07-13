import java.util.Scanner;
public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        while(i<n){
            if(n%i==0){
                sum = sum+i;
            }
            i++;
        }
        if(sum>n){
            System.out.println("It is a abundant number");
            System.out.println("the abundance is "+(sum-n));
        }
        else{
            System.out.println("Not a abundant number");
        }
        
    }
    
}
