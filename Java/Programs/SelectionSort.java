public class SelectionSort {
    public static void PrintArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }   
    }
    public static void main(String[] args) {
        int[] arr = {5,2,1,4,3};
        //time complexity O(n^2)
        for(int i = 0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length - i;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp= arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        PrintArray(arr);
    }
    
}
