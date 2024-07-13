import java.util.*;
public class Find2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int n = sc.nextInt();
        System.out.println("Enter Columns");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your input is");
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
        System.out.println("Enter the element to search");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(x == arr[i][j]){
                    System.out.println("Element "+x+" found at row "+(i+1)+" and column "+(j+1));
                }
            }
            System.out.println();
        } 

    } 
}
