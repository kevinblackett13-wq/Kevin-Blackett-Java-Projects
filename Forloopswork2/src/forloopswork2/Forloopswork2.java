/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopswork2;

/**
 *
 * @author 0182239
 */
import java.util.Scanner;
public class Forloopswork2 {
    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in);
            System.out.println("How many time would you like the program to run: ");
            int num  = Userinput.nextInt();
            
    for (int i=0;i<=num;i++){
       
        if (i%5==0){
        System.out.println("This number is divisable by 5: "+i);
    }
    
    }
               
    }
    
}
