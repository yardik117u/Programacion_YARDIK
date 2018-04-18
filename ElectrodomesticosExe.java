/**************************************************************************************************************************************************
******************************            Electrodomestico.java                                          ******************************************
******************************            Yardik Ulises Mancera Mendez && Angel Guillermo Martinez Cruz  ******************************************
**************************************************************************************************************************************************/
import javax.swing.*;
//creaccion del .exe
public class ElectrodomesticosExe {

//se inicialica tipoDeElectrodomestico
    public static void main(String[] args) {

        Electrodomestico tipoDeElectrodomestico[]=new Electrodomestico[10];

        tipoDeElectrodomestico[0]=new Electrodomestico(200, 60, 'C', "Verde");
        tipoDeElectrodomestico[1]=new Lavadora(150, 30);
        tipoDeElectrodomestico[2]=new Television(500, 80, 'E', "negro", 42, false);
        tipoDeElectrodomestico[3]=new Electrodomestico();
        tipoDeElectrodomestico[4]=new Electrodomestico(600, 20, 'D', "gris");
        tipoDeElectrodomestico[5]=new Lavadora(300, 40, 'Z', "blanco", 40);
        tipoDeElectrodomestico[6]=new Television(250, 70);
        tipoDeElectrodomestico[7]=new Lavadora(400, 100, 'A', "verde", 15);
        tipoDeElectrodomestico[8]=new Television(200, 60, 'C', "naranja", 30, true);
        tipoDeElectrodomestico[9]=new Electrodomestico(50, 10);

        double totalElectrodomesticos=0;
        double totalTelevisiones=0;
        double totalLavadoras=0;

        for(int i=0;i<tipoDeElectrodomestico.length;i++){
            if(tipoDeElectrodomestico[i] instanceof Electrodomestico){
                totalElectrodomesticos+=tipoDeElectrodomestico[i].precioFinal();
            }
            if(tipoDeElectrodomestico[i] instanceof Lavadora){
                totalLavadoras+=tipoDeElectrodomestico[i].precioFinal();
            }
            if(tipoDeElectrodomestico[i] instanceof Television){
                totalTelevisiones+=tipoDeElectrodomestico[i].precioFinal();
            }
        }

        JOptionPane.showMessageDialog(null,"La suma del precio de los electrodomesticos es de "+totalElectrodomesticos);
        JOptionPane.showMessageDialog(null,"La suma del precio de las lavadoras es de "+totalLavadoras);
        JOptionPane.showMessageDialog(null,"La suma del precio de las televisiones es de "+totalTelevisiones);
        
    }

}
