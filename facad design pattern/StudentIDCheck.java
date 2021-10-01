public class StudentIDCheck {
    private int studentId = 123456;

    public int getStudentId() {return this.studentId;}

    public boolean studentIdActive(int stdId){
        if(studentId == stdId){
            return true;
        } else {
            return false;
        }
    }
}
