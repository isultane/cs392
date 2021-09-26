public class Student {
    private String name;
    private String address;
    private String phone;

    private TestOrderInformation order = new TestOrderInformation();

    public Student(String name){
        this.name = name;
        address = null;
        phone = null;
    }

    public String toString(){
        String studentInfo = "";

        if (this.name != null){
            studentInfo += this.name;
        }
        if (this.address != null){
            studentInfo += ""+this.address;
        }
        if (this.phone != null){
            studentInfo += ""+this.phone;
        }
        return studentInfo;
    }
}
