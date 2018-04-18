/*****************************************
 *Pass.java                          *
 *yardik ulises mancera mendez           *
 *este es pass     *
 *****************************************/
 public class Pass{
  protected int longitud = 8;
  protected int contadorNumeros = 0;
  protected int contadorMayusculas = 0;
  protected int contadorMinusculas = 0;
  protected String pass;
  public void setLongitud(int longitud){
    this.longitud = longitud;
  }
  public int getLongitud(){
    return this.longitud;
  }
  public void setPass(String pass){
    this.pass = pass;
  }
  public String getPass(){
    return this.pass;
  }
  public String getFuerte(){
    String fuerte = getPass();
    for (int i = 0; i <= fuerte.length(); i++){
      if (Integer.parseInt(fuerte.charAt(i)) >= 65 && Integer.parseInt(fuerte.charAt(i)) <=90){
        contadorMayusculas += 1;
      }else if (Integer.parseInt(fuerte.charAt(i)) >= 97 && Integer.parseInt(fuerte.charAt(i)) <=122){
        contadorMinusculas += 1;
      }else if (Integer.parseInt(fuerte.charAt(i)) >= 48 && Integer.parseInt(fuerte.charAt(i)) <= 53){
        contadorNumeros += 1;
      }
    }//end for
    if (contadorMayusculas >= 2 && contadorMinusculas >= 1 && contadorNumeros >= 5){
      return "La contrasena es Fuerte";
    }else{
      return "La contrasena es Debil";
    }
  }//end boolean
}
