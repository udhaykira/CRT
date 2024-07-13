public class KeypadCombo {
    public static String[] arr = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void Combo(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char current = str.charAt(idx);
        String mapping = arr[current-'0'];
        for(int i=0;i<mapping.length();i++){
            Combo(str,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        Combo(str,0,"");
    }  
}
