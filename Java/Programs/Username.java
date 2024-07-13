import java.util.*;
class Username{
    public Boolean Login(String user,String password){
        Scanner sc = new Scanner(System.in);
        int j=1;
        while(j==1){
            System.out.println("Enter Username to login");
            String use = sc.nextLine();
            if(use.equals(user)){
                System.out.println("Hello welcome back "+user+", kindly enter your password to log in ");
                for(int i=0;i<=2;i++){
                    String ans = sc.nextLine();
                    if(password.equals(ans)){
                        return true;
                    }
                    else{
                        System.out.println("Invalid Password, you have "+(2-i)+" more chances");
                        if(i==2){
                            return false;
                        }
                    }  
                }
                return false;
    
            }
            else{
                System.out.println("Invalid username");
            }

        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String user = sc.nextLine();
        System.out.println("Enter password");
        String password=sc.nextLine();
        Username usernameInstance = new Username();
        Boolean ans = usernameInstance.Login(user,password);
        if(ans){
            System.out.println("Successful Login");
        }
        else{
            System.out.println("Your account has been Blocked");
        }
    }
}