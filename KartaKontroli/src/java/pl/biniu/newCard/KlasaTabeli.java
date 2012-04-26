
package pl.biniu.newCard;

public class KlasaTabeli {
private String no;
private String criteria;
private boolean status;
private String remarks;
private String answer;
private String proceededTo; 
private String problem;

    public KlasaTabeli(String no,String criteria,boolean status){
        this.no = no;
        this.criteria = criteria;
        this.status=status;
        this.remarks= "";
        this.answer ="";
        this.problem ="";
        this.proceededTo="";
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getProceededTo() {
        return proceededTo;
    }

    public void setProceededTo(String proceededTo) {
        this.proceededTo = proceededTo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
