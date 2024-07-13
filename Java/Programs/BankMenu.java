// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    int Balance = 1000;
    int deposit;
    int withdraw;
    int n;
    
    while(1){
        printf("1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4. Exit\n");
        printf("Select an option\n");
        scanf("%d",&n);
        switch(n){
        case 1: printf("Your Bank Balance is\n");
        printf("%d\n",Balance);
        break;
        case 2: printf("Amount to be deposited\n");
                scanf("%d",&deposit);
                Balance+=deposit;
                printf("Total Balance is %d\n",Balance);
                break;
        case 3: printf("Amount to be withdraw\n");
                scanf("%d",&withdraw);
                Balance -= withdraw;
                printf("Total Balance is %d\n",Balance);
                break;
        case 4: printf("Thank YOU\n");
                return 0;
        default:break;
            
        }
    }
    

    return 0;
}