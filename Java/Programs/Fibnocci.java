public class Fibnocci {
    public static void main(String[] args) {
        int n = 7;
        int a = 9;
        int b = 1;
        int temp = 0;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<10;i++){
            temp = a+b;
            //to find nth term remove print statement return thr b value
            a = b;
            b = temp;   
        }
        System.out.println(temp);
    }
    
}
