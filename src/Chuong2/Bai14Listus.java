package Chuong2;

import java.util.Scanner;

public class Bai14Listus {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner( System.in );
        int n;
        System.out.print("Nhap vao 1 so nguyen: ");
        n = scanner.nextInt();
        for(int i=1 ; i<=n ; i++) {
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
