import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter char: ");
        char ch = sc.next().charAt(0); // character input
        System.out.println(ch);
        // ASCII
        System.out.println((int) ch);
        sc.close();
    }
}
