/**********************************************
 *Circle.java                                 *
 *yardik ulises mancera mendez                *
 *This class calculates the area of a circle  *
 **********************************************/
 import javax.swing.*;
 public class Circle{
   //properties
   private double radius;
   //CONSTRUCTOR circle overload
   public Circle(){

   }
   public Circle(double radius){
     this.radius = radius;
   }
   //methods
   public void setRadius(double radius){
     this.radius=radius;
   }
   public double getRadius(){
     return this.radius;
   }
   public double getArea(){
     return Math.pow(this.radius,2)*Math.PI;

   }
   public static void main (String[]args){
     double radius= Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
     Circle circle= new Circle();

     JOptionPane.showMessageDialog(null,"The circles area with a radius of "+circle.getRadius()+"is "+ circle.getArea());
   }
 }
