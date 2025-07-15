// 1.WAP to find a sum of even number into 1D array.
//D-3

#include <stdio.h>
int main(){
    int n,i,sum=0;

    printf("Enter number of elements in array : ");
    scanf("%d",&n);

    int arr[n];
    
    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    
    for(i = 0; i < n; i++) {
        if(arr[i] % 2 == 0) {
            sum += arr[i];
        }
    }
    printf("Sum of even numbers = %d\n", sum);

    return 0;
}