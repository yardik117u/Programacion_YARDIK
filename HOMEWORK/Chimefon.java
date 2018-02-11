/***********************************************************************
 *Chimefon.java                                                        *
 *yardik ulises mancera mendez                                         *
 *este prorgama funciona como herramienta de corbranza de un telefono  *
 ***********************************************************************/
import javax.swing.JOptionPane;
public class Chimefon{
  public static void main (String[]args){
    int ti; //Tiempo
    String di; //Tipo de dia
    String tu; //Turno
    double pag; //Pago por el tiempo
    double imp; //Impuesto
    double tot; //Total que se va a pagar
    pag=0;
    imp=0;
    ti=Integer.parseInt(JOptionPane.showInputDialog("ingrese la duracion de la llamada "));
    if (ti<=5){
      pag=ti*1;
    }else if (ti>=6 && ti<=8){
      pag=(((ti-5)*0.80)+5.00);
    }else if (ti>=9 && ti<=10){
      pag=(((ti-8)*70)+7.40);
    }else if (ti>=10){
      pag=(((ti-10)*50)+8.80);
    }
    di=JOptionPane.showInputDialog("por favor indique si es Domingo o Dia Lavoral");
    switch(di){
      case "Domingo":
        imp=pag*.3;
      break;
      case "dia Lavoral":
        tu=JOptionPane.showInputDialog("por favor ingrese el horario am O pm");
        switch(tu){
          case "am":
            imp=pag*.15;
          break;
          case "pm":
            imp=pag*.10;
          break;
        }
      break;
    }
    tot=(pag+imp);
    JOptionPane.showMessageDialog(null, "Chimefon \n\n" + "Minutos hablados " + ti + "\n costo por minuto:$" + pag + "\nimpuesto $" + imp + "\nTotal a pagar: $" + tot );
  }
}
