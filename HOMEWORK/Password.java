/********************************
 *Password.java         *
 *yardik ulises mancera mendez  *
 *esta clase solicita contraseña*
 ********************************/
public class Password {
    private String Logitud;
    private String Pass;
    public String getLogitud() {
        return Logitud;
    }
    public String getPass() {
        return Pass;
    }
    public void setLogitud(String Logitud) {
        this.Logitud = Logitud;
    }
    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    public boolean Medir() {
      return Pass.length()>=8;
    }
    int m = 0;
    int y = 0;
    int num = 0;
    public boolean isStrong() {
        for (int i = 0; i <= Pass.length()-1; i++) {
            boolean p = Character.isUpperCase(Pass.charAt(i));
            if (p == true) {
                y = y + 1;
            } else {
            }
        }
        for (int i = 0; i <= Pass.length()-1; i++) {
            boolean pl = Character.isLowerCase(Pass.charAt(i));
            if (pl == true) {
                m = m + 1;
            } else {
            }
        }
        for (int i = 0; i <= Pass.length()-1; i++) {
              try{
                  Integer.parseInt(Pass.substring(i, i+1));
                  num = num + 1;
              }catch(Exception e){
              }
        }
        if (Medir() == true) {
            if (y >= 2) {
                if (m >= 1) {
                        if(num >= 5){
                            return true;
                        }else{
                            return false;
                        }
                } else {
                   return false;
                }
            } else {
                return false;
            }
        } else {
           return false;
        }
    }
}
