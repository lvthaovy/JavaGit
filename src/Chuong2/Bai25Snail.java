package Chuong2;

import java.util.Scanner;

public class Bai25Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, v;
        System.out.println("Lan luot nhap a,b va v: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        v = scanner.nextDouble();
        double x = 0;
        System.out.println(x);
        if (a == v)
            System.out.println("1");
        if ((v - b) % Math.abs(a - b) == 0)
            x = (v - b) / Math.abs(a - b);
        else
            x = ((v - b) / (a - b)) + 1;
        System.out.println("x="+x);
    }
}

