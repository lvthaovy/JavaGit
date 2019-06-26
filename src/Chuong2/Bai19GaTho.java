package Chuong2;

import java.util.Scanner;

public class Bai19GaTho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, a, b, c, d;
        System.out.println("Nhap tong so dau ga va tho: ");
        m = scanner.nextInt();
        System.out.println("Nhsp tong so chan ga va tho: ");
        n = scanner.nextInt();
        System.out.println("Nhap so dau 1 con ga va 1 con tho co:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Nhap so chan 1 con ga va 1 con tho co: ");
        c = scanner.nextInt();
        d = scanner.nextInt();

        int x=0, y=0;
        int D = a * d - b * c;
        int Dx = m * d - n * b;
        int Dy = a * n - m * c;
        if (D == 0)
            System.out.println("-1");
        else
            x = Dx / D;
        y = Dy / D;
        System.out.println("So luong ga: " + x);
        System.out.println("So luong tho: " + y);
    }
}