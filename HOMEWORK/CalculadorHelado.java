/************************************************
*yardik ulises mancera mendez
*
*CalculadorHelado.java
*Ths program is for area cone
****************************************///
import java.util.Scanner;
 public class CalculadorHelado{
   public static void main(String[]args){
     int r;
     int h;
     int at;
     double ac;
     final double pi=3.1416;
     double area;
     System.out.println("Enter the cone radio");
     Scanner R= new Scanner (System.in);
     r=R.nextInt();
     System.out.println("Enter the hypotenuse of the cone");
     Scanner H= new Scanner (System.in);
     h=H.nextInt();
     at= ((r*2)*h);
     ac= (((r*r)*pi)/2);
     area= (at+ac);
     System.out.println("The area of the cone is "+area);
   }//end main
 }//end the program CalculadorHelado
