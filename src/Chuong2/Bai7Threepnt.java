package Chuong2;

import java.util.Scanner;

public class Bai7Threepnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, y1;
        System.out.println("Nhap toa do diem A");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        double x2, y2;
        System.out.println("Nhap toa do diem B");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        double x3, y3;
        System.out.println("Nhap toa do diem C");
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        if (((x2 - x1) * (y2 - y1)) / ((x3 - x1) * (y3 - y1)) != 0)
            System.out.print("TRUE");
        else
            System.out.print("FALSE");
    }
}
