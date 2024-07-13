import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3= new ArrayList<>();
        //add element
        list1.add(0);
        list1.add(1);
        list1.add(3);
        System.out.println(list1);
        //get index
        System.out.println(list1.get(1));

        // add element in between
        list1.add(2,2);
        System.out.println(list1);

        //set ele
        list1.set(0,5);
        System.out.println(list1);

        //delete
        list1.remove(3);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);

        //size
        int size = list1.size();
        System.out.println(size);

        //iterate over array list
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        Collections.sort(list1);
        System.out.println(list1);
    }
    //sorting
    
}
