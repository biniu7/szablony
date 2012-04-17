
package pl.biniu;

import java.io.Serializable;
import java.util.Locale;
import javax.faces.context.FacesContext;


public class UserBean implements Serializable {
  /**@para a-parametr zliczjacy ilość prób*/
   private int a =0;  
   private String login ="";
   private String password ="" ;
   private String locale = "en";
public UserBean(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

   
   public String keyLogin(){
       if(password.isEmpty() || login.isEmpty())return"login";
       if (password.equals(login))return "main";
       a+=a;
       if (a>2)return "logout";
       return "login";
   }
   
    public String changeLocale(String languageCode) {
      FacesContext context = FacesContext.getCurrentInstance();
      context.getViewRoot().setLocale(new Locale(languageCode)); 
     setLocale(languageCode);
      return null;
   }
      
}