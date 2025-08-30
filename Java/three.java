// 3. WAP to find a Factor of a given number(iterative and recursive).
// D-4
import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Factors of "+n+" using iterative way : ");
        for(int i=1;i<=n;i++){
            if(n%i==0) System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Factors of "+n+" using recursive way : ");
        sc.close();
    }
    public static void findFactors(int n){
        
    }
}