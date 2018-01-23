/**************************************************
*yardik ulises mancera mendez
*CalculadorDeCircunferencia.java
*este programa calcula la circunferencia de un circulo
*********************************************/
import java.util.Scanner;
public class CalculadorDeCircunferencia{
  public static void main(String[]args){
    int radio;
    final double pi=3.1416;
    double area;
    System.out.println("ingrese el radio de la circunferencia: ");
    Scanner R =new Scanner (System.in);
    radio =R.nextInt();
    area=((radio*radio)*pi);
    System.out.println("el area de la circunferencia es: "+area);
  }
}
