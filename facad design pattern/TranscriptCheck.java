public class TranscriptCheck{
    private int numberOfCourses = 4;
	
	public int getNumberOfCoures() { return this.numberOfCourses; }
	
	public void decreaseCourses(int numberOfCoursesToDrop) { this.numberOfCourses -= numberOfCoursesToDrop; }
	
	public void increaseCourses(Integer numberOfCoursesToAdd) { this.numberOfCourses += numberOfCoursesToAdd; }
	
	public boolean haveEnoughCourses(int courcesToDisc) {
		
		if(courcesToDisc > getNumberOfCoures()) {
			
			System.out.println("Error: You don't have enough courses in your transcript");
			System.out.println("Current number of courses: " + getNumberOfCoures());
			
			return false;
			
		} else {
			
			decreaseCourses(courcesToDisc);
			
			System.out.println("Discontinue Complete: Current Balance is " + getNumberOfCoures());
			
			return true;
			
		}
		
	}
	
	public void addCourseToSchedule(int numberOfCourses) {
		
		if(getNumberOfCoures()+ numberOfCourses > 5 ){
            System.out.println("Sorrey your request can not be complete: courses should be 5 or less");
        }else {
            increaseCourses(numberOfCourses);
            System.out.println("Course adding Complete: Current number of courses is " + getNumberOfCoures());
        }
		
	}
}