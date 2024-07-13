public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 0;
        int bitMask = 1<<pos;
        int result = (bitMask | n);
        System.out.println(result);
    }
    
}
