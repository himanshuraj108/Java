package Conditional;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int m = sc.nextInt();
        if (m >= 81 && m <= 100) {
            System.out.println("Very Good");
        }

        else if (m >= 61 && m <= 80) {
            System.out.println("Good");
        }

        else if (m >= 40 && m <= 60) {
            System.out.println("Average");
        }

        else if (m < 40) {
            System.out.println("Fail");
        }
        sc.close();
    }
}
