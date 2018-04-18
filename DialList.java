/***************************************************************************
*DialList.java
*yardik ulises mancera mendez
*this program creates a cell phone dial phone number list and prints the created list
*******************************************/
import javax.swing.*;
public class DialList{
  public static void main (String[]args){
    long[] phoneList;//list of phone numbers
    int sizeList; //number of phone numbers
    long phoneNum;//an entered phone number
    sizeList= Integer.parseInt(JOptionPane.showInputDialog("how many phone numbers would you like to enter??"));//saber cuantos numero quiero guaradar
    phoneList=new long [sizeList];//inicializando phoneList
    for(int i=0;i<sizeList;i++) {
      phoneNum= Long.parseLong(JOptionPane.showInputDialog("Enter a phone number:"));
      phoneList[i]=phoneNum;
    }
    for(int i=0;i < sizeList ;i++ ){
      JOptionPane.showMessageDialog(null,"Index "+i+" Element number "+(i+1)+" phone number "+phoneList[i]);
    }
  }
}
