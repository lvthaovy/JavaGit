package Chuong2;

import java.util.Scanner;

public class Bai18CountSum {
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = scanner.nextInt();
        int dem = 1;
        int sum = n%10;
        while(n > 9)
        {
            n = n/10;
            sum = sum + n%10;
            dem++;
        }
        System.out.println("So chu so la: "+dem);
        System.out.print("Tong cac chu so la: "+sum);
    }
}
