/**********************************************
 *Contraseña.java                               *
 *yardik ulises mancera mendez                *
 * esta clase mide una contraseña y la verifica *
 **********************************************/
 import javax.swing.*;
 public class Contrasea{
   private int longitud;
   private String password;
   //Metodos
   public void setLongitud(int longitud){
     this.longitud=longitud;
   }
   public int getLongitud(){
     return this.longitud;
   }
   public void setPassword(String password){
     this.password=password;
   }
   public String getPassword(){
     return this.password;
   }
 }
