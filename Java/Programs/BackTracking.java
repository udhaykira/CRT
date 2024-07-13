public class BackTracking {
    public static void Print(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            Print(newStr,perm+curr);
        }
    }
    public static void main(String[] args) {
        Print("ABC","");
    }
    
}
