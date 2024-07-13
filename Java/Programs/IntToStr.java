import java.util.Scanner;

class IntToStr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s);
        if(n==Integer.parseInt(s)){
            System.out.println("Good Job");
        }
        else{
            System.out.println("Unsuccessful");
        }
    }

}