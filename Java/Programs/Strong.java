import java.util.*;
public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int n = sc.nextInt();
        int temp =n;
        int total = 0;
        while(n>0){
            int j= n%10;
            int sum = 1;
            for(int i=j;i>1;i--){
                sum = sum*i;
            }
            total = total +sum;
            n = n/10;
        } 
        if(temp == total){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }  
}
