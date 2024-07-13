public class Lcm {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int temp1 =a;
        int temp2 =b;
        while(a!=b){
           if(a>b){
            a = a-b;
           } 
           else{
            b=b-a;
           }
        }
        System.out.println("HCF is "+a);
        int lcm = (temp1*temp2)/a;
        System.out.println("LCM is "+lcm);     
    } 
}
