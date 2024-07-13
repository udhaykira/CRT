public class Recursive {
    public static void Print(int n,int i,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return ;
        }
        sum = sum + i;
        Print(n,i+1,sum); 
    }
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int n = 5;
        Print(n,i,sum);//Print(5,1,0);
    }
    
}
