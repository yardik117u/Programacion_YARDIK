/*********************************************
 *MenuBMIOOP.java                                 *
 *yardik ulises mancera mendez                *
 *este es un prototipo de menu para BMIOOP  *
 **********************************************/
import javax.swing.*;
public class MenuBMIOOP{
  public static void main(String[] args){
    BMIOOP person;
    person=new BMIOOP();
    person.setName(JOptionPane.showInputDialog("Ingrese su numbre"));
    person.setAge(Integer.parseInt(JOptionPane.showInputDialog("¿Que edad tiene?")));
    person.setWeigth(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso el libras")));
    person.setHeigth(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en pulgadas")));
    person.getBmi();
    if (person.getBmi()<16){
        JOptionPane.showMessageDialog(null, person.getName() + " con" + person.getAge() + " años \nYou are seriously underweight");
      }else if (person.getBmi()<18){
        JOptionPane.showMessageDialog(null, person.getName() + " con" + person.getAge() + " años \nYou are underweight");
      }else if (person.getBmi()<24){
        JOptionPane.showMessageDialog(null, person.getName() + " con " + person.getAge() + " años \nYou are normal weight");
      }else if (person.getBmi()<29){
        JOptionPane.showMessageDialog(null, person.getName() + " con " + person.getAge() + " años \nYou are overweight");
      }else if (person.getBmi()<35){
        JOptionPane.showMessageDialog(null, person.getName() + " con " + person.getAge() + " años \nYou are  seriusly overweight");
      }else{
        JOptionPane.showMessageDialog(null, person.getName() + " con " + person.getAge() + " años  \nYou are gravely overweight");
      }
  }
}
