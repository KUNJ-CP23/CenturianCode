//1. WAP to find a sum of even number into 1D array. 
//D-3

import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is : ");
        int evenSum=0;
        for(int i:arr){
            System.out.print(i+" ");
            if(i%2==0) evenSum+=i;
        }
        System.out.println();
        System.out.println("Sum of even numbers is : "+evenSum);
        sc.close();
    }
}