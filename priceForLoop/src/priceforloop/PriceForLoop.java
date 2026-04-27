/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priceforloop;

/**
 *
 * @author 0182239
 */
import java.util.Scanner;
public class PriceForLoop {
    public static void main(String[] args) {
        Scanner userInPut = new Scanner(System.in);
        int totalNum= 0;
    for (int i=1;i<=5;i++){
        System.out.println("Please enter a number");
        int num  = userInPut.nextInt();
         totalNum =totalNum + num;
    }
     int Avg = totalNum /5;
       System.out.println("The avg is :" + Avg);
    }
    
}
