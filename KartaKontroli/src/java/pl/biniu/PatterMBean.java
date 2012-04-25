
package pl.biniu;

public class PatterMBean {
private String orderNumber="[0-9\\ \\.\\-\\(\\)]*";
    public PatterMBean() {
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    
}
