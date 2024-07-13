import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int p = sc.nextInt();
        int count = 0;
        if(p==1 && p==0){
            System.out.println("Not a Prime");
        }
        else{
            for(int i =1;i<=p;i++){
                if(p%i==0){
                    count++;
                }
            }
            System.out.println("No of divisors "+count);
            if(count==2){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a prime");
            }
        }
    }
    
}
