import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;
        // arr[4]=5;
        // for(int i=0;i<5;i++){
        //     System.out.println(arr[i]);
        // }
        //int marks[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for(int i =0;i<size;i++){
            System.out.print(marks[i]+" ");
        }
    }  
}
