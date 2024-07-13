import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of candies");
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int count =0;
        if(n==0 || n==1 || n==2){
            System.out.println(count);
        }
        else{
            for(int i=1;i<n;i++){
                for(int j=1;j<n;j++){
                    if((i+j)==n){
                        count++;
                    }
                }
            }
            System.out.println(count/2);
        }
    }  
}

//int n;
// scanf("%d",&n);
// if(n==1 || n==2){
// 0
// }
// else if(n%2==0){
//     n/2 -1;
// }
// else{
//     n/2
// }