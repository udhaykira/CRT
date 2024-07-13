import java.util.*;
class Automorphic{
    public static boolean morphic(int n){
        int x = (int)Math.pow(n, 2);
        while(n>0){
            if(n%10 != x%10)
            {
                return false;
            }
            n/=10;
            x/=10;  
        }
        return true;

    }
    public static void main(String[] args) {
        int n = 7;
        if(morphic(n)){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("No Automorphic");
        }

        
    }
}