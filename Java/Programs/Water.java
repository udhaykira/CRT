import java.util.Scanner;

public class Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0 || n==2){
            System.out.println("no");  
        }
        else{
            int x = n/2;
            if(x%2==0){
                System.out.println(x+" "+x);
            }
            else{
                System.out.println((x+1)+" "+(x-1));
            }
        }
    }
}   
        
    
    

