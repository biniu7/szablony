
package pl.biniu.newCard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TableBean implements Serializable{
  
      private List<KlasaTabeli>tableDate= new ArrayList<KlasaTabeli>();
      private List<String>selectProblem = new ArrayList<String> ();
      private List<String>selectProceededTo = new ArrayList<String>();
      private KlasaTabeli selectRow;

    public TableBean(){
        tableDate.add(new KlasaTabeli("1", "Battery technical data", true));
        tableDate.add(new KlasaTabeli("2","Accessories technical data", true));
        tableDate.add(new KlasaTabeli("3","Stand technical data", true));
        tableDate.add(new KlasaTabeli("4","Specific packaging", true));
        tableDate.add(new KlasaTabeli("5", "Specific markings", true));
        tableDate.add(new KlasaTabeli("6", "Complete delivery address", true));
        tableDate.add(new KlasaTabeli("7", "Forwarder contact details", true));
        tableDate.add(new KlasaTabeli("8", "Consignee contact details", true));
        tableDate.add(new KlasaTabeli("9", "P/N exist in SAP", true));
        tableDate.add(new KlasaTabeli("10", "Correctness of P/N provided by customer", true));
        
        selectProblem.add("lack of information");
        selectProblem.add("incomplete information");
        selectProblem.add("unclear information (confusing)");
        selectProblem.add("incompatibility of SAP material number");
        selectProblem.add("incorrect P/N given by customer");
        selectProblem.add("incorrect layout");
        selectProblem.add("P/N missing in SAP");
        selectProblem.add("need to consult with Arras, if possible at all");
        selectProblem.add("to be advised by customer");
        selectProblem.add("insufficient knowledge");
        
         selectProceededTo.add("to clarify with customer");
        selectProceededTo.add("to calrify with Support Team");
        selectProceededTo.add("to clarify with Technical Support");
        selectProceededTo.add("to create request for new P/N");
        selectProceededTo.add("to consult with Arras");
        
    }

    public List<String> getSelectProblem() {
        
        return selectProblem;
    }

    public void setSelectProblem(List<String> selectProblem) {
        this.selectProblem = selectProblem;
    }

    public List<String> getSelectProceededTo() {
       
        return selectProceededTo;
    }

    public void setSelectProceededTo(List<String> selectProceededTo) {
        this.selectProceededTo = selectProceededTo;
    }

    public List<KlasaTabeli> getTableDate() {
       
        return tableDate;
    }

    public void setTableDate(List<KlasaTabeli> tableDate) {
        this.tableDate = tableDate;
    }

    public KlasaTabeli getSelectRow() {
        return selectRow;
    }

    public void setSelectRow(KlasaTabeli selectRow) {
        this.selectRow = selectRow;
    }
    
    
    
}
