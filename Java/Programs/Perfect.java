import java.util.*;
public class Perfect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(temp==sum){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
        
    }
    
}
