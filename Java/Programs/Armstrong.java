import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int total = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum + digit*digit*digit;
            num = num/10;
        }
        if(temp == sum){
            System.out.println(temp+" is a armstrong number");
        }
        else{
            System.out.println(temp+" is not a armstrong number");
        }
    }   
}
