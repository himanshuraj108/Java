import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double area = 3.14 * r * r;
        System.out.println(area);
        sc.close();
    }
}