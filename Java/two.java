// 2 WAP to find whether string is palindrome or not. 
// D-3

import java.util.*;

public class two{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";
        for(int i=str.length()-1 ; i>=0 ; i--){
            reversed += str.charAt(i);
        }

        if(str.equals(reversed))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
        sc.close();
    }
}