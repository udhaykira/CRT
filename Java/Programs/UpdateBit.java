import java.util.*;
public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the position");
        int pos = sc.nextInt();
        System.out.println("Update to 1 or 0");
        int bit = sc.nextInt();
        int bitMask = 1<<pos;
        if(bit == 1){
            int result = (bitMask|n);
            System.out.println("result is "+result);
        }
        else{
            int result = ((~bitMask)&n);
            System.out.println("result is "+result);
        }
    }  
}
