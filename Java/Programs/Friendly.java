import java.util.*;

public class Friendly {
    public static int sum(int num){
        int total = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                total+=i;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum1 = sum(num1);
        int sum2 = sum(num2);
        if(num1 == sum2 && num2 == sum1){
            System.out.println("Friendly numbers");
        }
        else{
            System.out.println("Not a Friendly numbers");
        }
    }
}
