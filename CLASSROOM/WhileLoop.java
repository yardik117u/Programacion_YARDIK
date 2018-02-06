/**********************************************
*WhileLoop.java
while = mientras
*yardik ulises mancera mendez
*this program makes entries in a bridal registry
************************************/
import javax.swing.JOptionPane;
public class WhileLoop{
    public static void main(String[]args){
        String registry = "";
        char more;
        more = JOptionPane.showInputDialog("do you want to create a bridal registry(y/n)").charAt(0);
        while (more=='y'){
          registry += JOptionPane.showInputDialog("Enter item: ");
          registry += JOptionPane.showInputDialog("Enter store: \n");
          }
          more = JOptionPane.showInputDialog("do you want to create a bridal registry(y/n)").charAt(0);
          if(!registry.equals("")){
            JOptionPane.showInputDialog(null, "\n bridal registry \n"+ registry);
          }

        }
    }
}
