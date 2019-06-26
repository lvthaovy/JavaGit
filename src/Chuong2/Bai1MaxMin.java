package Chuong2;

import java.util.Scanner;

public class Bai1MaxMin {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Nhap a: ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();
        System.out.print("Nhap c: ");
        c = scanner.nextInt();
        System.out.print("Nhap d: ");
        d = scanner.nextInt();
        int min = a;
        if (min > b)   min = b;
        if (min > c)   min = c;
        if (min > d)   min = d;
        int max = a;
        if (max < b)   max = b;
        if (max < c)   max = c;
        if (max < d)   max = d;
        System.out.println("So nho nhat la: "+min);
        System.out.println("So lon nhat la: "+max);

        Double sum= cong(a,b);
        System.out.println(sum);

        nhap(a,b);
    }

    private static void nhap(int a, int b) {

    }

    private static double cong(int a, int b) {
        return 0;
    }
}

