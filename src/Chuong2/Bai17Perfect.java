package Chuong2;

import java.util.Scanner;

public class Bai17Perfect  {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = scanner.nextInt();
        int s = 0 ;
        for (int i = 1; i <= n/2; i++)
        {
            if (n%i == 0)
                s += i;
        }
        if (s == n)
            System.out.print("TRUE");
        else
            System.out.print("FALSE");
    }
}

