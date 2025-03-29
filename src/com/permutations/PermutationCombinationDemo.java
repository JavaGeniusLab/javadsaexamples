package com.permutations;

import java.util.Scanner;

public class PermutationCombinationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, " ");

    }

    static void printPermutations(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println("ch----> "+ch+" i: "+i);
            String r = str.substring(0,i)+str.substring(i+1);
            System.out.println("r----> "+r+" ans+ch: "+ans+ch);
            printPermutations(r,ans+ch);
        }
    }
}
