/*****************************************************
*yardik ulises mancera mendez                        *
*DogDriver.java                                      *
*this program creates dog objects and uses dog class *
******************************************************/
import javax.swing.JOptionPane;
public class DogDriver{
  public  void maid(String[]args){
    Dog fido;
    fido=new Dog();
    fido.setColor("black");
    fido.setEyeColor("gray");
    JOptionPane.showMessageDialog(null,fido.getColor());
    JOptionPane.showMessageDialog(null,fido.getEyeColor());
    fido.eat();
    fido.barking();
    fido.sleep();
  }
}
