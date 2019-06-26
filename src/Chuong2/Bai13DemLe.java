package Chuong2;

import java.util.Scanner;

public class Bai13DemLe {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a, dem = 0;
        do {
            System.out.print("Nhap so nguyen: ");
            a = scanner.nextInt();
            for (int i = 0; i < a; i++) {
                if (a % 2 == 1) {
                    dem ++;
                    break;
                }
            }
        } while(a != 0);
        System.out.print("So cac so le la: "+dem);
    }
}
