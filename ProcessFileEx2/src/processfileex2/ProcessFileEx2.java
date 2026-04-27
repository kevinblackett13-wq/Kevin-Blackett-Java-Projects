/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package processfileex2;

/**
 *
 * @author 0182239
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ProcessFileEx2 {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
       try{
           String []names = new String [4];
           for(int i=0; i<names.length;i++){
               System.out.println("Please enter 4 names: ");
                names[i]=userInput.next();
           }
           
           File myFile =new File ("myDataFile.text");
          FileWriter fw = new FileWriter(myFile);
        
           int num= 0;
        while(num < names.length){
          fw.write (names[num]+"\n");
           num++;
        }
          fw.close();
      }
      catch(IOException e)
      {
      System.out.print("ERROR");
    }
  }
}
