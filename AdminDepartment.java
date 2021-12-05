/*This class contains information about Administration department*/
public class AdminDepartment extends SuperDepartment{
	
	/*This method would return the department name*/
	@Override
	public String departmentName() {
		return "Admin Department";
	}
	
	/*This method would return today's work*/
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	/*This method would return about work deadline*/
	@Override
	public String getWorkDeadline() {		
		return "Complete by EOD";
	}

}
