/**
 * Demoe code for running the facade degin pattern
 * @author Sulan S. Alqahtani
 * @date 10-01-2021
 */
public class TestFacadeMain {
    public static void main(String[] args) {
        StudentScheuleFacade stdSchedule = new StudentScheuleFacade(123456, 1234);

        stdSchedule.withdrawCourse(2);
        stdSchedule.addCourse(5);
    }
}
