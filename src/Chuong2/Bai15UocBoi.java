package Chuong2;

import java.util.Scanner;

public class Bai15UocBoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        double uc, bc;
        System.out.println("Nhap 2 so a va b: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        for (uc = a; uc >= 1; uc--) {
            if (a % uc == 0 && b % uc == 0) {
                break;
            }
        }
        for (bc = a; bc <= a * b; bc++) {
            if (bc % a == 0 && bc % b == 0) {
                break;
            }
        }
        System.out.println("Uoc chung lon nhat la: " + uc);
        System.out.print("Boi chung nho nhat la: " + bc);
    }
}
