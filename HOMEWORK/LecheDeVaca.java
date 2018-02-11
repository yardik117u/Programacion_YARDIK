/*******************************************************************************************************
 *LecheDeVaca.java                                                                                     *
 *yardik ulises mancera mendez                                                                         *
 *This program calculates what will be charged for a gallon of milk and shows the result on the screen.*
 *******************************************************************************************************/
import java.util.Scanner;
public class LecheDeVaca{
  public static void main(String[]args){
    int litros;
    final double litrosDeUnGalon =3.785;
    int precioDeUnGalon;
    double ganancia;
    System.out.println("Cantidad de litros que produce o entregara: ");
    Scanner L= new Scanner (System.in);
    litros = L.nextInt();
    final double galones= litros/litrosDeUnGalon;
    System.out.println("Produce "+galones+" Galones ");
    System.out.println("Ingrese el precio del galon");
    Scanner PG= new Scanner (System.in);
    precioDeUnGalon=PG.nextInt();
    ganancia= galones*precioDeUnGalon;
    System.out.println("Ganancia por la entrega de la leche es de: "+ganancia);
  }//end main
}//end Program LecheDeVaca
