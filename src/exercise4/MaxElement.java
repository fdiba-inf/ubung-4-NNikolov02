package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class  MaxElement  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = - 9999;
        //System.out.println("Enter the size of the array:");
        int  size = input.nextInt();
        double [] array = new double[size];
        //System.out.println("Enter numbers:");
        for(int index = 0;index < size ;index++){
        array[index] = input.nextInt();
        
        if(array[index] >  number){
          number = array[index];
        } 
        }
        System.out.println("Max number:" + number);
    }
}



        
  

         