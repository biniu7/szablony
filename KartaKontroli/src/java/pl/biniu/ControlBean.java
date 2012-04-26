
package pl.biniu;

import java.io.Serializable;

public class ControlBean implements Serializable{
  private int selectAccord=0;
public ControlBean(){
    
}

    public int getSelectAccord() {
        return selectAccord;
    }

    public void setSelectAccord(int selectAccord) {
        this.selectAccord = selectAccord;
    }

}
