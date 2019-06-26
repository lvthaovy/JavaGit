package Chuong2;

import java.util.Scanner;

public class Bai21PrimeFact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i;
        System.out.print("Nhap n: ");
        n = scanner.nextInt();
        for (i = 2; i <= n; i++)
            while (n % i == 0 && nguyento(i)) {
                System.out.println(i +" ");
                n /= i;
            }
    }


    private static Boolean nguyento(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}





