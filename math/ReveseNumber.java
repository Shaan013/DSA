/*
Problem Statement: Given an integer N return the reverse of the given number.

Note: If a number has trailing zeros, then its reverse will not include them. For e.g , reverse of 10400 will be 401 instead of 00401.
 */
package math;

import java.util.Scanner;

public class ReveseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();
        System.out.print("you reverse  number " + ReveseNum(num));

    }

    static int tenPower(int num) {
        int pw = 1;
        for (int i = 1; i < num; i++) {
            pw *= 10;
        }
        return pw;
    }


    public static int ReveseNum(int number) {
        int rev = 0, len = 0;
        int temnum = number;
        while (temnum > 0) {
            temnum = temnum / 10;
            len++;
        }

        for (int i = 0; i < len; i++) {
            int tem = number % 10;
            rev = rev + tem * tenPower(len - i);
            number /= 10;
        }
        return rev;
    }
}
