public class MoveAllX {
    public static void Word(String str,int count,int i,char a,String b){
        if(i==str.length()){
            for(int j=0;j<count;j++){
                b = b+'x';
            }
            System.out.println(b);
            return ;
        }
        if(str.charAt(i)==a){
            count = count+1;
        }
        else{
            b = b + str.charAt(i);
        }
        Word(str, count, i+1, a, b);
    }
    public static void main(String[] args) {
        Word("abcxxdex",0,0,'x',"");
    }
    
}
