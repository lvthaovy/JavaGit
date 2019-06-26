package Chuong2;

import java.util.Scanner;

public class Bai11Fact {
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Nhap n: ");
            n = scanner.nextInt();
        }
        while (n >= 23);
        int Giaithua = 1;
        for (int i = 2; i <= n ;i++ )
        {
            Giaithua = Giaithua*i;
        }
        System.out.print("Ket qua la: " +Giaithua);
    }
}
