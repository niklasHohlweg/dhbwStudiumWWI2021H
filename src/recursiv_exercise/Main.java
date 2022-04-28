package recursiv_exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        int n = sc.nextInt();
        System.out.println("n!: "+fakultaetR(n));
        System.out.println("n!: "+fakultaetI(n));
    }
    private static long fakultaetR(int n){
        if(n ==0 || n==1){return 1;}
        else{return n*fakultaetR(n-1);}
    }
    private static long fakultaetI(int n){
        long result =1;
        if(n ==0 || n==1){return 1;}
        else{
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
