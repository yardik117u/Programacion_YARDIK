/********************************
 *GeometricObject.java         *
 *yardik ulises mancera mendez  *
 *this a superclass             *
 *********************************/
 import java.util.Date;
 public class GeometricObject{
   private String color;
   private boolean filled; //rellenado
   private Date dateCreated;//fecha de creacion
   //mtethods
   public GeometricObject(){
     this.color ="purple";
     this.filled= true;
     this.dateCreated=new Date();
   }
   public GeometricObject(String color, boolean filled){
     this.color=color;
     this.filled=filled;
     this.dateCreated=new Date();
   }
   public void setColor(String color){
     this.color = color;
   }
   public String getColor(){
     return this.color;
   }

   public void setFilled(boolean filled){
     this.filled=filled;
   }
   public boolean getFilled(){
     return this.filled;
   }
   public Date setDateCreated(Date dateCreated){
     return this.dateCreated=dateCreated;
   }
   public Date getDateCreated(){
     return this.dateCreated;
   }
}
