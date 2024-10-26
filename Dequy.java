/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dequy;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Dequy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot so n: ");
        int n = sc.nextInt();
        System.out.println("nhap vao mot so x:");
        double x = sc.nextDouble();
        double result = sum10(x, n);
        double sum11 = S(n);
        double sum12 = S1(x, n);
        double sum13 = S2(x, n);
        double sum14 = S3(x, n);
        double sum15 = S4(n);
        double sum16 = S5(x, n);
        double sum17 = S7(x, n);
        int sum18 = S8(n);
        double sum19 = S9(n);
        double sum20 = S10(n);
        double sum21 = S11(n);
        double sum22 = S12(n);
        int sum23 = S13(n);
        int sum24 = S14(n);
        int sum25 = S15(n);
        int sum26 = S16(n);
        int sum27 = S17(n);
        int sum28 = S18(n);
        int sum29 = S19(n);
        int sum30 = S20(n);
        int sum31 = S21(n);
        int sum32 = S22(n);
        boolean sum33 = S23(n);
        boolean sum34 = S24(n);
        System.out.println("S(" + n + ") = " + sum1(n));
        System.out.println("S(" + n + ") = " + sum2(n));
        System.out.println("S(" + n + ") = " + sum3(n));
        System.out.println("S(" + n + ") = " + sum4(n));
        System.out.println("S(" + n + ") = " + sum5(n));
        System.out.println("S(" + n + ") = " + sum6(n));
        System.out.println("S(" + n + ") = " + sum7(n));
        System.out.println("S(" + n + ") = " + sum8(n));
        System.out.println("S(" + n + ") = " + sum9(n));
        System.out.println("T(" + x + "," + n + ") = " + result);
        System.out.println("S(" + n + ") = " + sum11);
        System.out.println("S(" + x + "," + n + ") = " + sum12);
        System.out.println("S(" + x + "," + n + ") = " + sum13);
        System.out.println("S(" + x + "," + n + ") = " + sum14);
        System.out.println("S(" + n + ") = " + sum15);
        System.out.println("S(" + x + "," + n + ") = " + sum16);
        System.out.println("S(" + x + "," + n + ") = " + sum17);
        System.out.println("S(" + n + ") = " + sum18);
        System.out.println("S(" + n + ") = " + sum19);
        System.out.println("S(" + n + ") = " + sum20);
        System.out.println("S(" + n + ") = " + sum21);
        System.out.println("S(" + n + ") = " + sum22);
        System.out.println("so luong chu so cua so nguyen duong n la: " + sum23);
        System.out.println("tong cac chu so cua so nguyen duong n la: " + sum24);
        System.out.println("tich cac chu so cua so nguyen duong n la: " + sum25);
        System.out.println("so luong chu so le cua so nguyen duong n la: " + sum26);
        System.out.println("tong cac chu so chan cua so nguyen duong n la: " + sum27);
        System.out.println("tich cac so le cua so nguyen duong n la: " + sum28);
        System.out.println("so dau tien cua so nguyen duong n la: " + sum29);
        System.out.println("so dao nguoc cua so nguyen duong n la: " + sum30);
        System.out.println("chu so lon nhat cua so nguyen duong n la: " + sum31);
        System.out.println("chu so nho nhat cua so nguyen duong n la: " + sum32);
        System.out.println("so " + n + (sum33 ? " co toan chu so le." : " khong co toan chu so le."));
        System.out.println("so " + n + (sum34 ? " co toan chu so chan." : " khong co toan chu so chan."));
    }
//bai 1

    private static int sum1(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum1(n - 1);
    }
// bai 2

    private static int sum2(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sum2(n - 1);
    }
// bai 3    

    private static double sum3(int n) {
        if (n == 1) {
            return 1;
        }
        return n / sum3(n - 1);
    }
// bai 4

    private static double sum4(int n) {
        if (n == 1) {
            return 1.0;
        }
        return 1.0 / (n * 2) + sum4(n - 1);
    }
// bai 5

    private static double sum5(int n) {
        if (n == 1) {
            return 1.0;
        }
        return 1.0 / (n * 2 + 1) + sum5(n - 1);
    }
//bai 6

    private static double sum6(int n) {
        if (n == 1) {
            return 1.0;
        }
        return 1.0 / (n * (n - 1)) + sum6(n - 1);
    }
// bai 7

    private static double sum7(int n) {
        if (n == 1) {
            return 1.0;
        }
        return n * (n + 1) + sum7(n - 1);
    }
//bai 8

    private static double sum8(int n) {
        if (n == 1) {
            return 1.0 / 2.0;
        }
        return (2.0 * n + 1.0) / (2.0 * n + 2.0) + sum8(n - 1);
    }
//bai 9    

    private static int sum9(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum9(n - 1);
    }
//bai 10

    private static double sum10(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n < 0) {
            return 1.0 / sum10(x, -n);
        } else {
            return x * sum10(x, n - 1);
        }
    }
//bai 11

    private static double sum11(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * sum11(n - 1);
    }

    private static double S(int n) {
        if (n == 0) {
            return 1;
        }
        return sum11(n) + S(n - 1);
    }
// bai 12

    private static double S1(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return Math.pow(x, n) + S1(x, n - 1);
    }
//bai 13

    private static double S2(double x, int n) {
        if (n == 0) {
            return 0;
        }
        return Math.pow(x, 2 * n) + S2(x, n - 1);
    }
// bai 14

    public static double S3(double x, int n) {
        if (n < 0) {
            return 0;
        }
        return Math.pow(x, 2 * n + 1) + S3(x, n - 1);
    }
// bai 15    

    public static double S4(int n) {
        if (n == 0) {
            return 0;
        }
        return 1.0 / ((n * (n + 1)) / 2) + S4(n - 1);
    }
//bai 16

    public static double S5(double x, int n) {
        if (n == 0) {
            return x;
        }
        return Math.pow(x, n) / S6(n) + S5(x, n - 1);
    }

    public static double S6(int num) {
        if (num == 0) {
            return 1;
        }
        return num * S6(num - 1);
    }
//bai 17

    public static double S7(double x, int n) {
        if (n < 0) {
            return 0;
        }
        return Math.pow(x, 2 * n) / S6(2 * n) + S7(x, n - 1);
    }
// bai 18

    public static int S8(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        return n;
    }
// bai 19

    public static double S9(int n) {
        if (n == 0) {
            return 0;
        }
        return Math.sqrt(2 + S9(n - 1));
    }
// bai 20

    public static double S10(int n) {
        if (n == 1) {
            return 1;
        }
        return Math.sqrt(n + S10(n - 1));
    }
//bai 21    

    public static double S11(int n) {
        double result = 0;
        for (int i = n; i >= 1; i--) {
            result = Math.sqrt(i + result);
        }
        return result;
    }
//bai 22

    public static double S12(int n) {
        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result = 1.0 / (1 + result);
        }
        return result;
    }
//bai 23

    public static int S13(int n) {
        return String.valueOf(n).length();
    }
// bai 24

    public static int S14(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
//bai 25

    public static int S15(int n) {
        int product = 1;
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }
// bai 26

    public static int S16(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
//bai 27

    public static int S17(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }
//bai 28

    public static int S18(int n) {
        int product = 1;
        boolean hasOddDigit = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                product *= digit;
                hasOddDigit = true;
            }
            n /= 10;
        }
        return hasOddDigit ? product : 0;
    }
//bai 29

    public static int S19(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
//bai 30

    public static int S20(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
//bai 31

    public static int S21(int n) {
        int max = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            n /= 10;
        }
        return max;
    }
//bai 32

    public static int S22(int n) {
        int min = 9;
        while (n > 0) {
            int digit = n % 10;
            if (digit < min) {
                min = digit;
            }
            n /= 10;
        }
        return min;
    }
//bai 33

    public static boolean S23(int n) {
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
//bai 34

    public static boolean S24(int n) {
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
