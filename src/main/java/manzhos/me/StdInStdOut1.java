package manzhos.me;

import java.util.Scanner;

public class StdInStdOut1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[]arr=new int[3];

        for (int i=0; i<=2; i++){
        int a = scan.nextInt();
        arr[i]=a;
    }

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    // Complete this line
    // Complete this line
}
}
