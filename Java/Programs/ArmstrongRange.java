public class ArmstrongRange {
    public static void main(String[] args) {
        int min = 370;
        int max = 410;
        for(int i=min;i<=max;i++){
            int temp = i;
            int sum = 0;
            while(temp!=0){
                int digit = temp%10;
                sum = sum + digit*digit*digit;
                temp = temp/10;
            }
            if(i == sum){
                System.out.println(i+" is a armstrong number");
            }
        }
    }   
}
