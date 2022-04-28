package recursiv_exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        int n = sc.nextInt();
        System.out.println("n!: "+fakultaet(n));
    }
    private static long fakultaet(int n){
        if(n ==0 || n==1){return 1;}
        else{return n*fakultaet(n-1);}
    }
}
