import java.util.ArrayList;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        int[] arr = {1, -1,-1};
        //{1, -1, 1, -1, -1, 1, 1, 1}
        ArrayList<Integer> arr1 = new ArrayList<>();
        int count = 0;
        Scanner sc = new Scanner(System.in);

        // 1 means hired
        // -1 crime occurred
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                // A policeman is hired, add a 1 to the list
                arr1.add(1);
            } else if (arr[i] == -1) {
                // A crime occurred
                if (!arr1.isEmpty()) {
                    // Remove one policeman from the list
                    arr1.remove(arr1.size() - 1);
                } else {
                    // No policemen available, increment the count of untreated crimes
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}




