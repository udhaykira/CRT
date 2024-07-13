public class Email {
    public static void main(String[] args) {
        String a = "Uday@gmail.com";
        String result ="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='@'){
                break;
            }
            else{
                result+=a.charAt(i);
            }
        }
        System.out.println("Username is "+result);
    }
    
}
