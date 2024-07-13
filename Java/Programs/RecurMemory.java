public class RecurMemory {
    //stack height log(n)
    public static int Power(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return Power(x,n/2)* Power(x,n/2);
        }
        else{
            return Power(x,n/2)* Power(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        int ans = Power(2,5);
        System.out.println(ans);
    }
    
}
