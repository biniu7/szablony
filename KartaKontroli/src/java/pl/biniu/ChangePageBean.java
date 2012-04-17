
package pl.biniu;
import java.io.Serializable;
public class ChangePageBean implements Serializable {

    
    public ChangePageBean() {
    }
    private String centerSections="/sections/main/center.xhtml";

    public String getCenterSections() {
        return centerSections;
    }

    public void setCenterSections(String centerSections) {
        this.centerSections = "/sections/"+centerSections+"/center.xhtml";
    }

   
    
}
