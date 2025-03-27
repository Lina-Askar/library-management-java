

package strproject;


public class Employee extends Person{
    
    private String SupTitle;
  
    public Employee() {
         this("","","");
    }

    public Employee(String SupTitle, String id, String name) {
        super(id, name);
        this.SupTitle = SupTitle;
    }

    public String getSupTitle() {
        return SupTitle;
    }

    public void setSupTitle(String SupTitle) {
        this.SupTitle = SupTitle;
    }
     @Override
    public String toString() {
        return String.format("%s, SupTitle : %s", super.toString(), getSupTitle());
    }

    @Override
    public void setID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
