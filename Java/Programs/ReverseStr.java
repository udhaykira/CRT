public class ReverseStr {
    public static void main(String[] args) {
        String a = "hello";
        System.out.println(a.length());
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
        System.out.println();
        //Using StringBuilder
        StringBuilder b = new StringBuilder("hello");
        for(int i=0;i<b.length()/2;i++){
            int front = i;
            int back = a.length()-1-i;
            char frontChar = b.charAt(front);
            char backChar = b.charAt(back);
            b.setCharAt(back, frontChar);
            b.setCharAt(front, backChar);     
        }
        System.out.println(b);
    }
    
}
