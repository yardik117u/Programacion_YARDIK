/**************************************************************************************************************************************************
******************************            Electrodomestico.java                                          ******************************************
******************************            Yardik Ulises Mancera Mendez && Angel Guillermo Martinez Cruz  ******************************************
**************************************************************************************************************************************************/
//creacion de clase Television heredando a la clase padre Electrodomestico
public class Television extends Electrodomestico{

//se declaran variables
  private int resolucion;
  private boolean sintonizadorTDT;

//se declara variable por defecto
  private final static int ResolucionD=20;

//se crean constructores
  public Television(){
     this(PrecioBaseD, PesoD, ConsumoEnergeticoD, ColorD, ResolucionD, false);
 }
 public Television(double precioBase, double peso){
      this(precioBase, peso, ConsumoEnergeticoD, ColorD, ResolucionD, false);
  }
  public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
     super(precioBase, peso, consumoEnergetico, color);
     this.resolucion=resolucion;
     this.sintonizadorTDT=sintonizadorTDT;
 }
 public double precioFinal(){
     double plus=super.precioFinal();
     if (resolucion>40){
         plus+=precioBase*0.3;
     }
     if (sintonizadorTDT){
         plus+=50;
     }
     return plus;
 }
}
