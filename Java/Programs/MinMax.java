public class MinMax {
    public static void main(String[] args) {
        int[] arr = {10,20,40,50,100};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);
    }  
}
