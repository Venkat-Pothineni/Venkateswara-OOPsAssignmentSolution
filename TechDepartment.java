/*This class contains information about Technical department*/
public class TechDepartment extends SuperDepartment{
	
	/*This method would return department name*/
	@Override
	public
	String departmentName() {
		return "Tech Department";
	}
	
	/*This method would return today's work*/
	@Override
	public
	String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	/*This method would return work deadline*/
	@Override
	public
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	/*This method would return technical stack information*/
	public String getTechStackInformation() {
		return "core Java";
	}
}
