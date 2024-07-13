public class RecursiveMemory {
    public static int Power(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int Power1 = Power(x,n-1);
        int Power2 = x*Power1;
        return Power2;
    }
    public static void main(String[] args) {
        int ans = Power(2,5);
        System.out.println(ans);
    }
    
}
