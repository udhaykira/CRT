public class RecurFib {
    public static void Fibnocci(int n,int a,int b){
        if(n==0){
            return ;
        }
        int temp = a+b;
        System.out.print(temp+" ");
        Fibnocci(n-1,b, temp);
    }
    public static void main(String args[]){
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.println("Fibnocci Series is ");
        System.out.print(a+" "+b+" ");
        Fibnocci(n-2,a,b);
    }
}
