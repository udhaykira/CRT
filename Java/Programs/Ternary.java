import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0){
            System.out.println("Number is equal to Zero");
        }
        else{
            String answer = (num>0) ? "Number is Positive":"Number is Negative";
            System.out.println(answer);
            //String answer = (num>0) ? "Number is Positive":((num<0)? "Number is Negative":"Equal to Zero");
            //Same time Complexity
        }
    }
    
}
