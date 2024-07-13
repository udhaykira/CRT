public class Mutable {
    public static void main(String[] args) {
        String a = "Vamse";
        String result = "";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='e'){
                result=result+'i';
            }
            else{
                result=result+a.charAt(i);
            }
        }
        System.out.println("Correct name is "+result);
    }
    
}
