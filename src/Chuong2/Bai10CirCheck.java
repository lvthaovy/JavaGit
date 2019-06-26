package Chuong2;

import java.util.Scanner;

public class Bai10CirCheck {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double xC, yC, R, xP, yP;
        System.out.print("Nhap hoanh do tam O: ");
        xC = scanner.nextDouble();
        System.out.print("Nhap tung do tam O: ");
        yC = scanner.nextDouble();
        System.out.print("Nhap hoanh do diem P: ");
        xP = scanner.nextDouble();
        System.out.print("Nhap tung do diem P: ");
        yP = scanner.nextDouble();
        System.out.print("Nhap ban kinh duong tron: ");
        R = scanner.nextDouble();
        double d = R - Math.sqrt( (xP - xC) * (xP - xC) + (yP - yC) * (yP - yC) );
        if (d < 0)
            System.out.println("Diem P nam trong duong tron ");
        if (d == 0)
            System.out.println("Diem P nam tren duong tron");
        if (d > 0)
            System.out.println("Diem P nam ngoai duong tron");
    }
}
