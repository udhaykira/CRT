import java.util.*;
public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //finding the bit
        System.out.println("Enter input number");
        int n = sc.nextInt();//5 = 0101
        System.out.println("Enter the position to find");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("bit is 0");
        }
        else{
            System.out.println("bit is 1");
        }   
    }
    
}
