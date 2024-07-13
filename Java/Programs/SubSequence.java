public class SubSequence {
    public static void Words(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char current = str.charAt(idx);
        //to be
        Words(str, idx+1, newString+current);
        //not to be
        Words(str, idx+1, newString);  
    }
    public static void main(String[] args) {
        Words("abc",0,"");
    }
    
}
