package Chuong2;

import java.util.Scanner;

public class Bai16Prime{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = scanner.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int d = 0;
            if (n % i == 0)
                d++;
            if (d == 0)
                System.out.print("TRUE");
            else
                System.out.print("FALSE");
        }
    }
}