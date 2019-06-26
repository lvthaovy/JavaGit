package Chuong2;

import java.util.Scanner;

public class Bai4Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, p, s;
        System.out.print("Nhap gio: ");
        h = scanner.nextInt();
        System.out.print("Nhap phut: ");
        p = scanner.nextInt();
        System.out.print("Nhap giay: ");
        s = scanner.nextInt();
        if ((h >= 0 && h <= 23) && (p >= 0 && p <= 59) && (s >= 0 && s <= 59)) {
            if ((h >= 0 && h <= 23) && (p >= 0 && p <= 59) && (s >= 0 && s < 59)) {
                s++;
            }
            if ((h >= 0 && h <= 23) && (p >= 0 && p < 59) && (s == 59)) {
                p++;
                s = 0;
            }
            if ((h >= 0 && h < 23) && (p == 59) && (s == 59)) {
                p = 0;
                s = 0;
                h++;
            }
            if (h == 23 && p == 59 && s == 59) {
                h = 0;
                p = 0;
                s = 0;
            }
            System.out.printf("Gio phut giay tiep theo la: %d:%d:%d", h, p, s);
        }
        else
            System.out.print("Ban da nhap sai!");
    }
}