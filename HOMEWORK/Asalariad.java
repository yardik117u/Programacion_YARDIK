/*******************
*yardik ulises mancera mendez
*Asalariad.java
*This program is for Sueldo Of week
********/////////////
import java.util.Scanner;

public class Asalariad{
  public static void main(String[]args){
    int PagoPorHora;
    int HorasTrabajadas;
    int DiasDeTrabajo;
    final double SueldoSemanal;
    System.out.println("Pago por hora");
    Scanner PH= new Scanner (System.in);
    PagoPorHora=PH.nextInt();
    System.out.println("Where hour you work at day");
    Scanner HT= new Scanner (System.in);
    HorasTrabajadas=HT.nextInt();
    System.out.println("where day work");
    Scanner DW= new Scanner (System.in);
    DiasDeTrabajo = DW.nextInt();
    SueldoSemanal= ((PagoPorHora*HorasTrabajadas)*DiasDeTrabajo);
    System.out.println("Su sueldo semanal es de:"+SueldoSemanal);
  }//end main
}//end program Asalariad
