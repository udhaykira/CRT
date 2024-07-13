public class BitClear {
    public static void main(String[] args) {
        int n = 5;
        int pos = 0;
        int BitMask = 1<<pos;
        int result = ((~BitMask)&n);
        System.out.println(result);
    }
    
}
