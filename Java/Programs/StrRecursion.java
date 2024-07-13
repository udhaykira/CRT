public class StrRecursion {
    public static void Reverse(String str,int i){
        if(i<0){
            return;
        }
        System.out.print(str.charAt(i));
        i--;
        Reverse(str, i);
    }
    public static void main(String[] args) {
        String str = "Uday";
        int i = str.length()-1;
        Reverse(str,i);
    }
    
}
