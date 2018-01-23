/**********************************************************************************
*Yardik Ulises Mancera Mendez
*AreaDeElRectangulo.java
*este programa calcula el area de un regtangulo y despues lo muestra en panatalla
**********************************************************************************************/
import java.util.Scanner;

public class AreaDeElRectangulo{
  public static void main (String[]arg){
    int base;
    int altura;
    int area;
    System.out.println("ingrese la base de el rectangulo: ");
    Scanner B = new Scanner (System.in);
    base=B.nextInt();//Base del el regtangulo
    System.out.print("ingrese la altura de el rectangulo: ");
    Scanner A = new Scanner (System.in);
    altura=A.nextInt();//Altura del rectangulo
    area=(base*altura);
    System.out.println("el area de el rectangulo es igual a: " + area);
  }
}
