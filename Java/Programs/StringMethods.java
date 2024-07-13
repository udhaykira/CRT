public class StringMethods {
    public static void main(String[] args) {
        //Concatenation
        String firstName = "Uday";
        String lastName = "Kiran";
        //String fullName = firstName+lastName;
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        //Length
        System.out.println(fullName.length());
        //charAt
        System.out.println(fullName.charAt(3));
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        //compareTo
        String a = "Hello";
        String b = "bello";
        //Check 3 cases
        //a>b : +ve value
        //a=b : 0
        //a<b : -ve value
        if(a.compareTo(b)==0){
            System.out.println("both are equal");
        }
        else if(a.compareTo(b)>0){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is smaller than b");
        }
        // if(new String("Uday")== new String("Uday")){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }
        //not equal
        //non primitive acquires differently in memory location

        //substring(start index,end index)
        String sentence="My name is Uday";
        System.out.println(sentence.substring(3,sentence.length()));
        //strings are immutable
    }
    
}
