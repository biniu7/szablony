
package pl.biniu.newCard;
import java.io.Serializable;
import java.util.*;
public class InputNewCard implements Serializable{

  private String orderNumber;  
  private String processingPerson;
  private List<String> personaList = new ArrayList<String>();
  private String customer;
  private List<String>customerList = new ArrayList<String>();
  private String orderedBy;
  private List<String>orderedByList = new ArrayList<String>();
  private String producer;
  private List<String>producerList = new ArrayList<String>();
  private  Date orderDate;
  private Date requestedDispatchDate;
  private Date controlStartedAt;
  private List<String>selectRequestedCertificates;
  private Map<String,String>requestedCertificates;
  private boolean quality;
  private boolean conformity;
  private boolean origin;
  private boolean batteryTests;
  private List<String>table;
  
    public InputNewCard() {
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProcessingPerson() {
        return processingPerson;
    }

    public void setProcessingPerson(String processingPerson) {
        this.processingPerson = processingPerson;
    }

    public List<String> getPersonaList() {
        personaList.add("                    ");
        personaList.add("Kowalski Jan");
        personaList.add("Nowak Tomasz");
        return personaList;
    }

    public void setPersonaList(List<String> personaList) {
        this.personaList = personaList;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<String> getCustomerList() {
        customerList.add("                    ");
        customerList.add("Druteks jan zoo");
        customerList.add("KWP Frankowscy");
        return customerList;
    }

    public void setCustomerList(List<String> customerList) {
        this.customerList = customerList;
    }

    public String getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    public List<String> getOrderedByList() {
        orderedByList.add("                     ");
        orderedByList.add("Niedzwiedz Józef");
        orderedByList.add("Kowalski Mateusz");
        return orderedByList;
    }

    public void setOrderedByList(List<String> orderedByList) {
        this.orderedByList = orderedByList;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public List<String> getProducerList() {
        producerList.add("                 ");
        producerList.add("Kopalnia kuznia");
        producerList.add("Mechtech Gdańsk");
        return producerList;
    }

    public void setProducerList(List<String> producerList) {
        this.producerList = producerList;
    }

    public Date getOrderDate() {
        orderDate = new Date();
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequestedDispatchDate() {
        return requestedDispatchDate;
    }

    public void setRequestedDispatchDate(Date requestedDispatchDate) {
        this.requestedDispatchDate = requestedDispatchDate;
    }

    public Date getControlStartedAt() {
        return controlStartedAt;
    }

    public void setControlStartedAt(Date controlStartedAt) {
        this.controlStartedAt = controlStartedAt;
    }

    public Map<String, String> getRequestedCertificates() {
        requestedCertificates = new HashMap<String, String>();
        requestedCertificates.put("battery tests", "battery tests");
        requestedCertificates.put("origin", "origin");
        requestedCertificates.put("conformity", "conformity");
        requestedCertificates.put("quality", "quality");
        return requestedCertificates;
    }

    public void setRequestedCertificates(Map<String, String> requestedCertificates) {
        this.requestedCertificates = requestedCertificates;
    }

    public List<String> getSelectRequestedCertificates() {
        return selectRequestedCertificates;
    }

    public void setSelectRequestedCertificates(List<String> selectRequestedCertificates) {
        this.selectRequestedCertificates = selectRequestedCertificates;
    }

    public boolean isBatteryTests() {
        return batteryTests;
    }

    public void setBatteryTests(boolean batteryTests) {
        this.batteryTests = batteryTests;
    }

    public boolean isConformity() {
        return conformity;
    }

    public void setConformity(boolean conformity) {
        this.conformity = conformity;
    }

    public boolean isOrigin() {
        return origin;
    }

    public void setOrigin(boolean origin) {
        this.origin = origin;
    }

    public boolean isQuality() {
        return quality;
    }

    public void setQuality(boolean quality) {
        this.quality = quality;
    }
    
    
    
   
}
