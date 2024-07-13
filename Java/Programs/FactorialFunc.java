public class FactorialFunc {
    public static int Fact(int n){
        if(n<0){
            System.out.println("invalid");
            return -1;
        }
        if(n==0){
            return 1;
        }
        else{
            return n*Fact(n-1);      
        }   
    } 
    public static void main(String[] args) {
        int n =-5;
        System.out.println("Factorial of "+n+" is : "+Fact(n));
    } 
}
