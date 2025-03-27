


package strproject;



public class Student extends Person {
 
    private String Major;

    public Student() {
        this("", "", "");
    }

    public Student(String Major, String id, String name) {
        super(id, name);
        this.Major = Major;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    @Override
    public String toString() {
        return String.format("%s, major: %s", super.toString(), getMajor());
    }

    @Override
    public void setId(String id) {
        if (id.length() == 9) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be exactly nine characters long");
        }
    }

    @Override
    public void setID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
