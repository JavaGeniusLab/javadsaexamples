package com.maximum;
import java.util.Scanner;

public class MaximumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int maxnum = num1>num2?num1:num2;
        System.out.println(maxnum);
    }
}
