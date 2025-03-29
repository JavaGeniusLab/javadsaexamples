package com;
import java.util.Scanner;
import java.util.ArrayList;

public class TribnocciSeries {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c=2;
        int d = a+b+c;
        ArrayList<Integer> tribSeriesList = new ArrayList<>();
        tribSeriesList.add(a);
        tribSeriesList.add(b);
        tribSeriesList.add(c);
        tribSeriesList.add(d);
        for (int i=2;i<= n-3;i++){
            a=b;
            b=c;
            c=d;
            d=c+b+a;
            tribSeriesList.add(d);
        }
        System.out.println(tribSeriesList);
    }
}
