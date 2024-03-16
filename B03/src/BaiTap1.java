import java.util.Scanner;

public class BaiTap1 {
    public static void tinhPtBac2(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm là: " + x1 + " và " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: " + x);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("Nhap b");
        b = sc.nextInt();
        System.out.println("Nhap c");
        c = sc.nextInt();
while(a==0)
{
    System.out.println("Nhap lại a");
    a = sc.nextInt();
}

        tinhPtBac2(a,b,c);
    }
}
