/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapcalculator;

/**
 *
 * @author 0182239
 */
import java.util.Scanner;
public class ShapCalculator {
    public static void displayWelcome () {
        System.out.println("Welcome User!");
        return;
}
 public static void calcQuad (double Width,double Length) {
     double area = Width*Length;
     System.out.println("The area is: "+ area );
 }
 public static double calcVolume (double Width,double Length,double Higth) {
     double volume = Width*Length;
     System.out.println("The area is: "+ volume );
     return volume;
 }
    public static void main(String[] args) {
        displayWelcome();
        Scanner userInPut = new Scanner(System.in);
        System.out.println("Please enter the Length, Width : ");
        double Length = userInPut.nextDouble();
        double Width = userInPut.nextDouble();
        System.out.println("Please enter the Higth: ");
        double Higth = userInPut.nextDouble();
        double volume =calcVolume(Width,Length,Higth);
       //Method 1: "double volume =calcVolume(Width,Length,Higth);" which store it as a verible
       //Method 2 System.out.println("volume is" + calcVolume(Width,Length,Higth)); put it in output stream
       //Method 3: "double x = t+calcVolume(Width,Length,Higth);" use it as an expression
    }
    
}
