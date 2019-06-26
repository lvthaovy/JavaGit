package Chuong2;

import java.util.Scanner;

public class Bai9Angle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x1, y1, x2, y2, x3, y3;
        System.out.println("Nhap toa do diem A: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.println("Nhap toa do diem B: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        System.out.println("Nhap toa do diem C: ");
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double c = (x1 - x2) * (x3 - x2) + (y1 - y2) * (y3 - y2);
        double d = c / (a * b);

        if (d < 0) {
            System.out.println("3");
        }
        if (d > 0) {
            System.out.println("1");
        }
        if (d == 0) {
            System.out.println("2");
        }

    }
}