/**************************************************************************************************************************************************
******************************            Electrodomestico.java                                          ******************************************
******************************            Yardik Ulises Mancera Mendez && Angel Guillermo Martinez Cruz  ******************************************
**************************************************************************************************************************************************/
//creacion de clase Lavadora heredando a la clase padre Electrodomestico
public class Lavadora extends Electrodomestico{

//se declaran variables
    private double carga = 5;

//valor por defecto
    private final static int CargaD=5;

//constructores
    public Lavadora(){
         this(PrecioBaseD, PesoD, ConsumoEnergeticoD, ColorD, CargaD);
       }
    public Lavadora(double precioBase, double peso){
            this(precioBase, peso, ConsumoEnergeticoD, ColorD, CargaD);
        }
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
             super(precioBase, peso, consumoEnergetico, color);
             this.carga=carga;
         }
    public double getCarga() {
               return carga;
             }
    public double precioFinal(){
                    double plus=super.precioFinal();
                    if (carga>30){
                        plus+=50;
                      }
                    return plus;
                }
              }
