public class Duplicates {
    public static boolean[] arr = new boolean[26];
    public static void Dupli(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        if(arr[str.charAt(idx)-'a']==false){
            newString+=str.charAt(idx);
            arr[str.charAt(idx)-'a']=true;
            Dupli(str,idx+1,newString);
        }
        else{
            Dupli(str,idx+1,newString);
        }
    }
    public static void main(String[] args) {
        Dupli("aabbcdd",0,"");
    }   
}
