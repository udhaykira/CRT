import java.util.HashSet;
public class UniqueSeq {
    public static void Words(String str,int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char current = str.charAt(idx);
        //to be
        Words(str, idx+1, newString+current,set);
        //not to be
        Words(str, idx+1, newString,set);  
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Words("aaa",0,"",set);
    }
    
}

