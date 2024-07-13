import java.util.*;
public class Repeating {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<5;i++){
            int count = 0;
            for(int j=0;j<5;j++){
                if(arr[i]==arr[j] && i!=j){
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
            }
        }

    }
}
    