import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double y = (double) n;
        System.out.println(y / 2);
        sc.close();
    }
}
