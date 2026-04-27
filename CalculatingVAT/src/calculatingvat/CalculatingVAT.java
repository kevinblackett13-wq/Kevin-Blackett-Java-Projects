/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatingvat;

/**
 *
 * @author 0182239
 */
import java.util.Scanner;
public class CalculatingVAT 
{
    public static void main(String[] args) 
    {
        Scanner Userinput = new Scanner(System.in);
        System.out.println("Please enter the prices of the three item: itemone, itemtwo,itemthree");
            double itemone  = Userinput.nextInt();
                while(itemone <=0){ 
                    System.out.println("This price is Zero or below please try again");
                    itemone= Userinput.nextDouble();
            }
        System.out.println("Enter itemtwo");
            double itemtwo = Userinput.nextInt();
                while(itemtwo<=0 ){ 
                    System.out.println("This price is Zero or below please try again");
                    itemtwo= Userinput.nextDouble();
            }
        System.out.println("Enter itemthree");
            double itemthree = Userinput.nextInt();
                while(itemthree<=0 ){ 
                    System.out.println("This price is Zero or below please try again");
                    itemthree= Userinput.nextDouble();
            }
        System.out.println("Please enter the a Vat percent between 15 and 18");
                    double vat = Userinput.nextDouble();
            while(vat <=15 || vat>=18){ 
                    System.out.println("Wrong value please enter the a Vat percent between 15 and 18");
                    vat = Userinput.nextDouble();
            }
        // Calculate 
        double totalPrice=(itemone + itemtwo + itemthree);
        double totalVat=(vat/100)*totalPrice;
        double totalPriceVat=(totalVat + totalPrice);
        
        //Display the info
        System.out.println("The Vat percent " + vat +" % ");
        System.out.println("The Vat on the item's " + totalVat );
        System.out.println("The original price of the tree items: ");
        System.out.println("The price of item 1 " + "$" + itemone );
        System.out.println("The price of item 2" + "$" + itemtwo );
        System.out.println("The price of item 3" + "$" + itemthree );
        System.out.println("The total price with Vat:" + "$" + totalPriceVat);
         
               Userinput.close();
    }
    
}
