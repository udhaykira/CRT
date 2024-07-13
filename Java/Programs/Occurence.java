public class Occurence {
    public static void Repeat(String str,int i,int first,int last,char a){
        if(i==str.length()){
            System.out.println("First Occurence at "+first);
            System.out.println("Last Occurence at "+last);
            return;
        }
        if(str.charAt(i)==a){
            if(first==-1){
                first=i;
            }
            last =i;
        }
        Repeat(str, i+1, first, last, a);   
    }
    public static void main(String[] args) {
        Repeat("aaabbbcccfb",0,-1,-1,'b');
    }
    
}
