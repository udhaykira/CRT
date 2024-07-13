import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int n = sc.nextInt();
        int temp = 0;
        int j = 0;
        while(n>0){
            int i=n%10;
            temp = temp + i*(int)Math.pow(2, j);
            n=n/10;
            j++;
        }
        System.out.println("Decimal number is "+temp);
    }

}
