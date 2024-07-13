public class RecurFact {
    public static int Factorial(int n){
        if(n==1 || n==0){
            return 1 ;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        int ans = Factorial(5); 
        System.out.println(ans); 
    } 
}
