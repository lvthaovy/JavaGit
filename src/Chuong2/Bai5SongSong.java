package Chuong2;

import java.util.Scanner;

public class Bai5SongSong {
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
        double x4, y4;
        System.out.println("Nhap toa do diem D");
        x4 = scanner.nextDouble();
        y4 = scanner.nextDouble();
        if ((Math.abs(x2 - x1) / Math.abs(y2 - y1) ) == (Math.abs(x4 - x3) / Math.abs(y4 - y3)))
            System.out.print("TRUE QUA TRUE");
        else
            System.out.print("FALSE");
    }
}
