import java.util.Scanner;

public class profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CS: ");
        int cp = sc.nextInt();
        System.out.print("Enter SP: ");
        int sp = sc.nextInt();

        if (sp > cp)
            System.out.println("Profit");
        else if (cp > sp)
            System.out.println("Loss");
        else
            System.out.println("No Profit and No Loss");
            sc.close();
    }
}
