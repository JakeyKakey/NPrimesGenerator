package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("How many primes? ");
        int primes = kb.nextInt();
        printPrimes(primes);

    }

    private static void printPrimes(int n) {
         if(n >= 1){
             System.out.print(2 + " ");
             n--;
            }
        int i = 2;
        while(n > 0){
            i = findNextPrime(i);
            n--;
        }
    }
    
    private static int findNextPrime(int lastPrime) {
      int i = lastPrime;
      boolean primeFound = false;
      while (!primeFound){
          i++;
          primeFound = testForPrime(i);
      }
      return i;
    }
    
    private static boolean testForPrime(int currentTestedInt){
        for(int i = 2; i <= currentTestedInt/2; i++){
            if (currentTestedInt % i == 0){
                return false;
            }
        }
        System.out.print(currentTestedInt + " ");
        return true;
    }
}