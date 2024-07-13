import java.util.*;
public class SpiralMatrix {
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
        System.out.println("Spiral Matrix is");
        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = m-1;
    while(row_start<=row_end && col_start<=col_end){
        for(int col=col_start;col<=col_end;col++){
            System.out.print(arr[row_start][col]+" ");
        }
        row_start++;
        for(int row=row_start;row<=row_end;row++){
            System.out.print(arr[row][col_end]+" ");
        }
        col_end--;
        for(int col=col_end;col>=col_start;col--){
            System.out.print(arr[row_end][col]+" ");
        }
        row_end--;
        for(int row=row_end;row>=row_start;row--){
            System.out.print(arr[row][col_start]+" ");
        }
        col_start++;
       
    } 

    } 
}
