package com.maximum;
import java.util.Scanner;

public class MaxThreeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max = (a>b && a>c)?a:(b>c?b:c);
        System.out.println(max);
    }
}
