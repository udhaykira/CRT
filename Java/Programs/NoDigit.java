import java.util.*;
public class NoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=0;
        int temp = num;
        int digit=0;
        while(num!=0){
            digit = num%10;
            i = i+1;
            num = num/10;
        } 
        System.out.println("Number of digits in "+temp+" is "+i);
    }   
}
