/**************************************
*calculadorDelSueldoDeUnTrabajador.java
*yardik Ulises Mancera mendez
*este programa calcula el salario de un trabajador
********************************/
import javax.swing.JOptionPane;
public class calculadorDelSueldoDeUnTrabajador{
    public static void main(String[]args){
      final double horasTrabajadas, pagoPorHora;
      horasTrabajadas= Float.parseFloat(JOptionPane.showInputDialog("Ingrese las horas horas Trabajadas por el empleado: "));
      pagoPorHora= Float.parseFloat(JOptionPane.showInputDialog("Ingreseel sueldo por hora de el empleado:$"));
      double sueldoSemanal=horasTrabajadas*pagoPorHora;
      JOptionPane.showMessageDialog(null, "La cantidad a pagar a el trabajador es de :$" + sueldoSemanal);
    }
}
