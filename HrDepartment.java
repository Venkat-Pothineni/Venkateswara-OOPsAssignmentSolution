/*This class contains information about HR department*/
public class HrDepartment extends SuperDepartment{

	/*This method would return department name*/
	@Override
	public
	String departmentName() {
		return "HR Department";
	}
	
	/*This method would return about today's work*/
	@Override
	public
	String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	/*This method would return the work deadline*/
	@Override
	public
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	/*This method would return team's activity*/
	public String doActivity() {
		return "team Lunch";
	}
}
