import java.util.Scanner;

public class Bear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        if(limak<=bob){
            for(int i=1;i<10;i++){
                limak*=3;
                bob*=2;
                if(limak>bob){
                    System.out.println("Number of years "+i);
                    return;
                }
            }
        }
        else{
            System.out.println("Limak weight is greater than bob");
        }
    }
    
}
