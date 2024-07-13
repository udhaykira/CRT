import java.util.*;;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the inputs");
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Your input is");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("After bubble sort :");
        //time complexity is O(n^2) becoz in big O constants are ignored
        for(int i=0;i<size-1;i++){//n-1
            int temp = 0;
            for(int j=0;j<size-i-1;j++){//n-i-1
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        } 
    }
    
}
