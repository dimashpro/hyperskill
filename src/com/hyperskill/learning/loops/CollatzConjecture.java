/**
Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:

If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result.
*/
import java.util.Scanner;

class CollatzConjecture {
    public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 1){
            System.out.print(n + " ");
            if(n%2 == 0){
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.print(1);
    }
}