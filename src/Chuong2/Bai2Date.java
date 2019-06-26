package Chuong2;//package chuong2;
//
//import java.util.Scanner;
//
//public class Bai2Date {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int date, month, year,datemax;
//        System.out.print("Nhap ngay: ");
//        date = scanner.nextInt();
//        System.out.print("Nhap thang: ");
//        month = scanner.nextInt();
//        System.out.print("Nhap nam: ");
//        year = scanner.nextInt();
//        if (year % 4 == 0 && year % 100 != 0) {
//            switch (month) {
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12:
//                    datemax = 31;
//                    break;
//                case 2:
//                    datemax = 29;
//                    break;
//                case 4:
//                case 6:
//                case 9:
//                case 11:
//                    datemax = 30;
//                    break;
//            }
//        } else {
//            switch (month) {
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12:
//                    datemax = 31;
//                    break;
//                case 2:
//                    datemax = 28;
//                    break;
//                case 4:
//                case 6:
//                case 9:
//                case 11:
//                    datemax = 30;
//                    break;
//
//            }
//        }
//
//        if (date > datemax)
//            System.out.println("Trong nam ko co ngay nay!");
//        else {
//            if ((date == datemax) && (month == 12)) {
//                date = 1;
//                month = 1;
//                year++;
//            } else if ((date == datemax)) {
//                date = 1;
//                month++;
//            } else
//                date = date + 1;
//
//            System.out.printf("Ngay thang nam tiep theo la: %d/%d/%d", date, month, year);
//        }
//
//    }
//}
//
