package Chuong2;

import java.util.Scanner;

public class Bai8TriCheck {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("Nhap do dai canh 1: ");
        a = scanner.nextDouble();
        System.out.print("Nhap do dai canh 2: ");
        b = scanner.nextDouble();
        System.out.print("Nhap do dai canh 3: ");
        c = scanner.nextDouble();
        if ((a*a + b*b) >= c*c)
            System.out.print("Co the ghep thanh tam giac ");
        else
            System.out.print("Khong the ghep thanh tam giac ");
    }
}
