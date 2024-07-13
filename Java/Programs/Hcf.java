public class Hcf {
    public static void main(String[] args) {
        int a = 36;
        int b = 60;
        int hcf = 0;
        for(int i=1;i<=Math.min(a, b);i++){
            if(a%i==0 && b%i==0){
                hcf =i;
            }
        }
        System.out.println("HCF of "+a+" and "+b+" is "+hcf);
        System.out.println();
        //method 2
        while(a!=b)
        {
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        System.out.println("HCF is "+a);
    }   
}
