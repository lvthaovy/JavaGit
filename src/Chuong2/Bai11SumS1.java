package Chuong2;

import java.util.Scanner;

public class Bai11SumS1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = scanner.nextInt();
        double s = 1;
        for(int i = 2; i <= n ; i++)
        {
            s = s + 1.0 / i;
        }
        System.out.print("Tong la: "+s);
    }
}
