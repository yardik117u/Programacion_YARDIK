/**************
*yardik ulises mancera mendez
*MetrosAPulgadas.java
*This ptogram is for converter
**********////////
import java.util.Scanner;
public class MetrosAPulgadas{
  public static void main(String[]args){
    int metros;
    final double PG=(0.0254 );
    final double result;
  System.out.println("Cantidad de metros que requiera : ");
  Scanner CM= new Scanner (System.in);
  metros = CM.nextInt();
  System.out.println("Pulgadas que debe pedir son: ");
  result=(metros*PG);
  System.out.println(result);
  }//end main
 }//end MetrosAPulgadas
