package com.prime;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input <= 1){
            System.out.println("Not a prime number");
        }
        for(int i=2;i<=input;i++){
            System.out.println("input: "+input + " i: "+i);
            System.out.println("modulus value: "+input%i);
            if(input%i==0)
            {
                System.out.println("Not a Prime Number");
            }else{
                System.out.println("Is a Prime Number");
            }
        }
    }
}
