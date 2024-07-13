public class ReverseNum {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0,d;
        while(num>0){
            d = num%10;
            rev = rev*10+d;
            num = num/10;
        }
        System.out.println(rev);
    }
    
}
