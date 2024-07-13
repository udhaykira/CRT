import java.util.*;
class Increment{
    public static void main(String[] args) {
        int a = 6;
        System.out.println((++a)+" "+(++a)+" "+(++a));
        //7,8,9
        //in c - 9,9,9
        //(a++)+" "+(a++)+" "+(a++) in java
        // 6 7 8
        //In C it is dfferent
        //8,8,8 because it checks according to priority
        //pre < post
        //post will print and increment pre will increment and print in java
        //post will print and increment pre will increment and check priority left wont print if there and shift and then print and all other will same in C
        //ex i=5
        //printf("%d %d %d %d %d",++i,i++,i++,++i,i++)
        //10 8 7 10 5

        // int a=6,b=4,c=?
        // c=a++;
        // b=++c;
        // a=b++;
        // a++;
        // a,b,c
        //8,8,7



        
        
        
    }
}