
public class TestSingletonMain {
    public static void main(String[] args){
        Major mj1 = Major.getInstance();
        Major mj2 = Major.getInstance();
        
        Student std1 = new Student("Sultan", 221133, mj1);
        std1.print();


        Student std2 = new Student("Ali", 2323, mj2);
        std2.print();
        
    }
}
