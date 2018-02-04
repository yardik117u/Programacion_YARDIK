/***********************************************************
*metrosAPulgadasGui.java
*yardik ulises mancera Mendez
*este programa convierte metros a pulgadas
**********************************/
import javax.swing.JOptionPane;
public class metrosAPulgadasGui{
    public static void main(String[]args){
        final double cantidadDeMetrosQueRequiere;
        final double PULGADA = 0.0254;
        cantidadDeMetrosQueRequiere = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los metros que desea convertir: "));
        double pulgadasTotales = (cantidadDeMetrosQueRequiere/PULGADA);
        JOptionPane.showMessageDialog(null, "La cantidad de pulgadas que deve pedir es : " + pulgadasTotales);
    }
}
