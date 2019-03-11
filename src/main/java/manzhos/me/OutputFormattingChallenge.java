package manzhos.me;

import java.util.Scanner;

public class OutputFormattingChallenge {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] intArr = new int[2];
        String[] strArray = new String[2];
        System.out.println("================================");
        for(int i=0;i<3;i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%s" + "\t" + "%03d", s1, x);
        }
        System.out.println("================================");
    }
}
