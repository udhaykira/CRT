import java.util.*;
public class SumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int sum = 0;
        for(int i=min;i<=max;i++){
            sum+=i;
        }
        System.out.println("Total Sum is "+sum);
        System.out.println();
        sum=0;
        for(int i=min+1;i<max;i++){
            sum+=i;
        }
        System.out.println("Total Sum is "+sum);
    }   
}
