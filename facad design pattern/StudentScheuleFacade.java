public class StudentScheuleFacade {
    private int studentIDaccont;
	private int privacyCode;
	
	StudentIDCheck idChecker;
	privacyCheck privacyChecker;
	TranscriptCheck transChecker;
	
	WelcomeToSchool schoolWelcome;
	
	public StudentScheuleFacade(int newIdAcctNum, int newPrivCode){
		
		studentIDaccont = newIdAcctNum;
		privacyCode = newPrivCode;
		
		schoolWelcome = new WelcomeToSchool();
		
		idChecker = new StudentIDCheck();
		privacyChecker = new privacyCheck();
		transChecker = new TranscriptCheck();
		
	}
	
	public int getStdIdNumber() { return this.studentIDaccont; }
	
	public int getPrivacyCode() { return this.privacyCode; }
	
	
	public void withdrawCourse(int courseToDrop){
		
		if(idChecker.studentIdActive(getStdIdNumber()) &&
                privacyChecker.isPrivacyCodeCorrect(getPrivacyCode()) &&
                transChecker.haveEnoughCourses(courseToDrop) ){
					
					System.out.println("Withdrown Corse Complete\n");
					
				} else {
					
					System.out.println("Withdrown Course Failed\n");
					
				}
		
	}
	
	
	public void addCourse(int courseToAdd){
		
		if(idChecker.studentIdActive(getStdIdNumber()) &&
                privacyChecker.isPrivacyCodeCorrect(getPrivacyCode())&&
                transChecker.haveEnoughCourses(courseToAdd)){
					transChecker.addCourseToSchedule(courseToAdd);
					System.out.println("Adding Corse Complete\n");
					
				} else {
					
					System.out.println("Adding Course Failed\n");
					
				}
		
	}
}
