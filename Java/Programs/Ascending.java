public class Ascending {
    public static void main(String[] args) {
        int[] arr = {10,30,20,40};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println();
        System.out.println("Sorted array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
