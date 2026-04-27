/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytester;

/**
 *
 * @author 0182239
 */
import java.util.Scanner; 
public class ArrayTester {
    public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in); 
        	int sum = 0;
        	// Task 1- Declare an integer array called 'numbers' of size 5
        	 int[] numbers= new int[5];
        
        	
        	System.out.println("Please enter 5 integers:");
              //  int num1 = scanner.nextInt();
		//Task 2- enter the variable to start the array count
        	for ( int i=0; i < numbers.length; i++) {
                    numbers[i]=scanner.nextInt();
            		//Task 3- Accept the values from the user & store in in the array            		 
        	}
                
        	// Calculate the sum of all elements in the array
                sum=numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        	//Task 4- enter the variable to start the array count
        	for (  int i=0; i < numbers.length; i++) {
            		//Task 5- sum the array elements
                       sum=numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
			
        	}
        
        	// Print the sum of the array elements
        	System.out.println("The sum of the array elements is: " + sum);
    }
}
 
