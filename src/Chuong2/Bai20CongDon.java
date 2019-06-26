package Chuong2;

import java.util.Scanner;

public class Bai20CongDon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, n, s = 0;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            a = scanner.nextInt();
            if (Prime(a))
                break;
            if (a % i == 0)
                s += a;
        }
        System.out.println(s);
    }

    private static boolean Prime(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= a; i++)
            if (a % i != 0)
                return false;
        return true;
    }

}

