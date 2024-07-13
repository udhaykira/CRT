public class Hanoi {
    public static void Tower(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return; // Terminate the function when n equals 1
        }
        Tower(n-1, src, dest, help);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        Tower(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        Tower(n,"A","B","C");
    }   
}
