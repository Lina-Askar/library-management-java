

package strproject;


public abstract class Person {
    
    protected String id;
    private String name;

    public Person() {
        this("", "");
    }

    public Person(String id, String name) {
        setId(id);
        setName(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Id: %s, Name: %s", getId(), getName());
    }
    
    public abstract void setID(String id);


}
