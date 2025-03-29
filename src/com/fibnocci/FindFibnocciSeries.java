package com.fibnocci;
import java.util.ArrayList;
import java.util.Scanner;

public class FindFibnocciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        ArrayList<Integer> fibNumbers = new ArrayList<>();
        fibNumbers.add(a);
        fibNumbers.add(b);
        for(int i=1;i<=n-2;i++){
            c= a+b;
            fibNumbers.add(c);
            a=b;
            b=c;
        }
        System.out.println(fibNumbers);
    }
}
