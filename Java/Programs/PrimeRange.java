public class PrimeRange {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        for(int i=min+1;i<max;i++){
            int count = 0;
            for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }       
                }
                if(count==2){
                    System.out.print(i+" ");
                }
            }
        }
    }

