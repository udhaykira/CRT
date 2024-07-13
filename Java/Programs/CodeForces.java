import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int count = 0;
            int number = 0;
            
            while (count < n) {
                number++;
                if ((number % 3 != 0) && (number % 10 != 3)) {
                    count++;
                }
               
            }
            
            System.out.println(number);
        }
        
        sc.close();
    }
}
