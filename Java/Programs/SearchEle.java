import java.util.*;
public class SearchEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array is");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element to search");
        int num = sc.nextInt();
        for(int i=0;i<size;i++){
            if(num==array[i]){
                System.out.println("Element "+num+" found at index number "+i);
            }
        }
    } 
}
