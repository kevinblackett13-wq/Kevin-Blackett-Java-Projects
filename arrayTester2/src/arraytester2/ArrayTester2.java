/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytester2;

/**
 *
 * @author 0182239
 */
import java.util.Scanner;
public class ArrayTester2 {
public static void numArray(String[] args) {
  
}
    /**
    Task 1: 
    - Create a method called searchNumArray
    - Accepts: two parameters (an array of integers and an integer)
    - Processing: searches the array (which is the first parameter) for the target (which is the second parameter)
                and if it is found in the array the method should return the index position. 
                Otherwise, the method should return -1.
    
    */
    
    /**
    Task 2: 
    - Create a method called searchNameArray
    - Accepts: two parameters (an array of Strings and a String)
    - Processing: searches the array (which is the first parameter) for the target (which is the second parameter)
                and if it is found in the array the method should return the index position. 
                Otherwise, the method should return -1.
    
    */
    public static void main(String[] args) { 
            Scanner scanner = new Scanner(System.in); 
            int[]numArray={4, 67, 8, 9, 12, 30, 56};
            String[]nameArray=new String[4];
            boolean isFound = false;
            //Task 3a: Create an integer array called numArray, initialized with the following numbers: 4, 67, 8, 9, 12, 30, 56.
            
            
            //Task 3b: Create a String array called nameArray that will hold 4 names



            //Task 3c: //complete the code for the loop below to get the 4 names from the user and  store in nameArray.
            System.out.println("Please enter 4 names");
            for ( int i=0  ; i < nameArray.length; i++) 
            {
                    //Accept the values from the user & store in in the array
                nameArray[i]=scanner.next();
                     
            }
 
            System.out.println("Please enter the number to search for a number");
            String searchNum=scanner.nextLine();
            
            for(int i=0;i < nameArray.length; i++ ){
                if(searchNum==nameArray[i]){
                System.out.println("Number found"+i);}
                isFound=true;
                break;
            }
            if(!isFound){
                System.out.println("The name can't befound.");
            }
            
            /**
            //Task 4:
            a. Ask the user to enter a number to search for in the numArray.
            b. Call the searchNumArray method appropriately.
            c. Results of the method call should be displayed with a user-friendly message USING JOptionPane.
             */
           
             
            /**
            //Task 5:
            a. Ask the user to enter a name to search for in the nameArray.
            b. Call the searchNameArray method appropriately and display its result.
            c. Results of the method call should be displayed with a user-friendly message USING JOptionPane.
            */
         
            
    }
}
