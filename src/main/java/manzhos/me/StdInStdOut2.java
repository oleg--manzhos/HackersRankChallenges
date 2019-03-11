package manzhos.me;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdInStdOut2 {

    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i <= 2; i++) {
            String a = scan.nextLine();
            arr.add(a);
        }

        String s =arr.get(2);
        double d = Double.valueOf(arr.get(1));
        int i = Integer.valueOf(arr.get(0));

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
