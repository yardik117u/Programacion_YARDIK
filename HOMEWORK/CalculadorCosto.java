/******************
*yardik ulises mancera medez
*CalculadorCosto.java
*This program is for payment pool
********************////
import java.util.Scanner;
public class CalculadorCosto{
  public static void main(String[]args){
    int a;
    int l;
    int n;
    int cm;
    double v;
    double pag;
    System.out.println("Enter the height of the pool");
    Scanner A= new Scanner (System.in);
    a=A.nextInt();
    System.out.println("Length of the pool");
    Scanner L= new Scanner (System.in);
    l=L.nextInt();
    System.out.println("Enter the width of the pool");
    Scanner N= new Scanner (System.in);
    n=N.nextInt();
    System.out.println("Enter the cost of the cubic meter");
    Scanner CM= new Scanner (System.in);
    cm=CM.nextInt();
    v=((l*n)*a);
    System.out.println("The volume os the pool is: "+v);
    pag=(v*cm);
    System.out.println("Payment to be made for consumition is: "+pag);
  }//end main
}//end the program CalculadorCosto
