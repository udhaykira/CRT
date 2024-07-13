import java.util.*;
import java.lang.Math;
public class PrimeFactor {
    public static boolean prime(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){   
                count = count +1; 
            }
            if(count > 2){
                return false;
            }
        }
        return true;
    }
    

    public static void PrimeFactor(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                while(n%i==0){
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeFactor(n);
        }
    }

    
