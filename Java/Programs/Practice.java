public class Practice {
    public static void main(String[] args) {
        int n = 1010;
        int temp = n;
        int sum=0;
        int i=0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit*(int)Math.pow(2, i);
            n=n/10;
            i++;
        }
        System.out.println(sum);
    }
    
}
