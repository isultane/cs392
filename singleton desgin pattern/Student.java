
public class Student {
    private String name;
    private int ID;
    private Major stMajor;

    public Student(String name, int id, Major major){
        this.name = name;
        this.ID = id;
        this.stMajor = major;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.ID = id;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.ID;
    }
    
    public void print(){
        System.out.println("Student info. : "+ this.name + " "+ this.ID +" "+ this.stMajor);
    }
}
