/********************************
 *ImplementPassword.java         *
 *yardik ulises mancera mendez  *
 *este programa usa clase assword.java*
 ********************************/
 import javax.swing.*;
 public class ImplementPassword{
   public static void main(String[] args){
     Password pas;
     pas= new Password();
     pas.getPass(JOptionPane.showInputDialog("Enter your Password"));
     if (pas.getPass()=tue{
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
