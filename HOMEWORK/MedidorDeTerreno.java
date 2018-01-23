/****************
*Yardik ulises mancera mendez
*MedidorDeTerreno.java
*This program is to obtain the respective area of ​​a land
*****************/
import java.util.Scanner;

 public class MedidorDeTerreno{
  public static void main(String[]args){
    int BaseDelRectangulo;
    int BaseDelTriangulo;
    int AlturaDelTrianguloYRectanguloUnidos;
    int AlturaDelRectangulo;
    final double AreaDelTriangulo;
    final double AreaDelRectangulo;
    final double result;
    System.out.println("Ingrese la Base del rectangulo y triangulo");
    Scanner B= new Scanner (System.in);
    BaseDelRectangulo= B.nextInt();
    BaseDelTriangulo= B.nextInt();
    System.out.println("Ingrese la altura del triangulo y rectangulo unidos");
    Scanner A= new Scanner (System.in);
    AlturaDelTrianguloYRectanguloUnidos= A.nextInt();
    System.out.println("Ingrese la altura del rectangulo");
    Scanner C= new Scanner (System.in);
    AlturaDelRectangulo= C.nextInt();

    AreaDelTriangulo=(BaseDelTriangulo*AlturaDelTrianguloYRectanguloUnidos)/2;
    AreaDelRectangulo=(BaseDelRectangulo*AlturaDelRectangulo);
    result= (AreaDelTriangulo+AreaDelRectangulo);
    System.out.println("La area del terreno es:"+result);
      System.out.println("Hasta la proxima :V");
  }//end main
}//end ConstructionCompany
