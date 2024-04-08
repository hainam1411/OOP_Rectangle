import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        int width = input.nextInt();
        System.out.println("Nhap chieu rong: ");
        int height = input.nextInt();

        Rectangle hcn = new Rectangle(width, height);
        hcn.display();
        System.out.println("Dien tich: " + hcn.getArea());
        System.out.println("Chu vi: " + hcn.getPerimeter());
//    Rectangle HCN = new Rectangle(3.5, 7.8);
//    Rectangle HCN1 = new Rectangle(5.3, 7.8);
//
//    HCN1.display();
//    HCN.display();

    }
}