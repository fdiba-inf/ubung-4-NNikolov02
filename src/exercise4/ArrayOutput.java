package exercise4;



import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
         int n = input.nextInt();
         int[] numbers = new int[n];
         
         for (int i = 0; i < n; i++) {
         numbers[i] = input.nextInt();
        
         } 
         for (int i = 0; i < n; i++) {
           for (int h = 0; h<i; h++) {
             System.out.print(" ");

           }

           System.out.println(numbers[i]);
         }


       }

    
