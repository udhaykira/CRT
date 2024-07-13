import java.util.*;
class Crime1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,police=0,untreated=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter 1 or -1");
            int event = sc.nextInt();
            if(event==-1){
                if(police>0){
                    police--;
                }
                else{
                    untreated++;
                }
            }
            else{
                police=police+event;
            }
        }
        System.out.println("Unsolved "+untreated);

    }
}
//if element contains other than -1 or 1 this code is best suit