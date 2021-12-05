/* Super department class which is super class
 * of all other departments
 */
public class SuperDepartment {
	
	/*This method should return Super department name */
     public String departmentName() {
    	 return "Super Department";
     }
     
     /*This Method will return todays work */
     public String getTodaysWork() {
    	 return "No Work as of now";
     }
     
     /*This Method would return work deadline*/
     public String getWorkDeadline() {
    	 return "Nil";
     }
     
     /*This method should return whether today is holiday or not*/
     public String isTodayAHoliday() {
    	 return "Today is not a holiday";
     }
}
