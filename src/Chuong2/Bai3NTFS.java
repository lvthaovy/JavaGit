package Chuong2;

import java.util.Scanner;

public class Bai3NTFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, d;
        System.out.println("Nhap n:");
        n = scanner.nextInt();
        if (n <= 4096)
            d = 4;
        if (n % 4096 ==0 )
            d = (n/4096)*4;
        else
            d = (n / 4096) * 4 + 4;
        System.out.println("So KB la: " + d);
    }
}
