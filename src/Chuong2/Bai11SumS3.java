package Chuong2;

import java.util.Scanner;

public class Bai11SumS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        int n = 0;
        do {
            System.out.print("Nhap x = ");
            x = scanner.nextDouble();
        }while (x <= 0);
        do {
            System.out.print("Nhap n = ");
            n = scanner.nextInt();
        }while (n < 0);
        double temp = 1, s = 1;
        for (int i = 1; i <= n; i++) {
            temp = temp * x / i;
            s += temp;
        }
        System.out.print("Tong la: "+s);
    }
}
