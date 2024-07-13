public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1};
        boolean isAscending = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    
}
