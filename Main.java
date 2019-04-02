package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci ");
        int n = show.nextInt();
        int jumlah = 0;
        long fib[] = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = n-1; i > 0; i--) {
            System.out.print(fib[i] +  " ");
            jumlah += fib[i];
        }
        System.out.println("\n"+jumlah);
//        System.out.println("\n");
//        for (int i=1;i<=4;i++){
//            for(int j=4;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            for (int l=1;l<=i-1;l++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=5;i++){
//            for(int j=1;j<=i-1;j++){
//                System.out.print(" ");
//            }
//            for(int z=5;z>=i;z--){
//                System.out.print("*");
//            }
//            for(int k=4;k>=i;k--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }

}
