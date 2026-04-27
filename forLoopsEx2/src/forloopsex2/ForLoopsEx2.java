/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopsex2;

/**
 *
 * @author 0182239
 */
import java.util.Scanner;
public class ForLoopsEx2 {
    public static void menu() {
    
    }
    public static void upsideDownTriangle(int column) {
     for (int i = 1; i <= column; i++)  //outer loop - rows
        {
            //note the stop condition i <= i for the loop below
            for (int j = 1; j <= i; j++)  //inner loop - columns 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void triangle(int column) {
             for (int i = column; i >=1 ; i--)  //outer loop - rows
        {
            //note the stop condition i <= i for the loop below
            for (int j = 1; j <= i; j++)  //inner loop - columns 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    
public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
System.out.println("Please enter the numbers of columns and rows you would like:");
    int column=userInput.nextInt();
    triangle(column);
    upsideDownTriangle(column);
    }
    
}
        