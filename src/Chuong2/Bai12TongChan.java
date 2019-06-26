package Chuong2;

import java.util.Scanner;

public class Bai12TongChan {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n,a;
        System.out.print("Nhap n: ");
        n = scanner.nextInt();
        int s = 0;
        int i =1;
        while (i <= n)
        {
            System.out.print("Nhap a: ");
            a = scanner.nextInt();
            if (a %2 == 0)  s += a;
            i++;
        }
        System.out.println("Tong cac so chan la: "+s);
    }
}
