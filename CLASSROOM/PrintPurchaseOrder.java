/*****************************************************
*yardik ulises mancera mendez
*PrintPurchaseOrder.java
*this program calculates and print"s a purchase order amount
***********************/

import java.util.Scanner;

public class PrintPurchaseOrder{
  public static void main (String[]args){
    Scanner userData = new Scanner(System.in);
    double price;
    int quantity;
    String name;

    System.out.println("Enter your name:");
    name = userData.nextLine();
    System.out.println("Enter the price: ");
    price =userData.nextDouble();
    System.out.println("Enter the quantity: ");
    quantity = userData.nextInt();

    System.out.println("Hello "+ name+"!");
    System.out.println("Total purchase order: $"+ (price*quantity));
  }
}
