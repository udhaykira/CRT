public class Sorting {
    public static void Print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,1,4,3};
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble Sort ");
        Print(arr);
        System.out.println();
        System.out.println("Selection Sort ");
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            
        }
        Print(arr);
        System.out.println();
        System.out.println("Insertion sort");
        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int current = arr[i];
            while(j<=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;    
        }
        Print(arr);
    }
    
}
