package Conditional;

import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println(-n);
        }

        else {
            System.out.println(n);
        }

        sc.close();
    }

}
