package com.factorial;

import java.util.Scanner;
/**
 * Program to find factorial of given number
 */
public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt();
        System.out.println(executeFactorialbyRecursion(input));
        System.out.println(executeFactorialByLooping(input));
    }

    private static int executeFactorialByLooping(Integer input) {
        int factorial = 1;
        for(int i=1;i<=input;i++){
            factorial=factorial *i;
        }
        return factorial;
    }

    public static int executeFactorialbyRecursion(Integer number){
    if(number ==1){
        return 1;
    }else{
        return number * executeFactorialbyRecursion(number-1);
    }
    }
}
