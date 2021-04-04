/**
A right rotation is an operation that shifts each element of an array to the right. For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}. If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

Write a program that performs a right rotation on an array by a given number.
*/

import java.util.Scanner;
class RightRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int rotations = scanner.nextInt();
        if (rotations > arr.length) {
            rotations = rotations % arr.length;
        }
        for (int i = 0; i < rotations; i++) {    
            int j;  
            String last;  
            last = arr[arr.length - 1];    
            
            for (j = arr.length - 1; j > 0; j--) {    
                arr[j] = arr[j - 1];    
            }    
            arr[0] = last;    
        }    
        
        for (int i = 0; i < arr.length; i++) {    
            System.out.print(arr[i] + " ");    
        } 
    }
}