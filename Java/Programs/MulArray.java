import java.util.*;
public class MulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter input");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your input");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The desired output is");
        for(int i=0;i<size;i++){
            int sum = 1;
            for(int j=i+1;j<size;j++)
            {
                sum = sum*arr[j];
            }
            for(int k=i-1;k>=0;k--){
                sum = sum*arr[k];
            }
            System.out.print(sum+" ");
        }
    }   
}
