/*This class acts as driver for all departments*/
public class DepartmentDriver {
	public static void main(String[] args) {
		
		/*Instantiating the departments*/
		AdminDepartment adt = new AdminDepartment();
		HrDepartment hrdt = new HrDepartment();
		TechDepartment tdt = new TechDepartment();
		
		/*Outputting Administration department*/
		System.out.print("Welcome to ");
		System.out.println(adt.departmentName());
		System.out.println(adt.getTodaysWork());
		System.out.println(adt.getWorkDeadline());
		System.out.println(adt.isTodayAHoliday());
		System.out.println();
		
		/*Outputting HR department*/
		System.out.print("Welcome to ");
		System.out.println(hrdt.departmentName());
		System.out.println(hrdt.doActivity());
		System.out.println(hrdt.getTodaysWork());
		System.out.println(hrdt.getWorkDeadline());
		System.out.println(hrdt.isTodayAHoliday());
		System.out.println();
		
		/*Outputting Technical department*/
		System.out.print("Welcome to ");
		System.out.println(tdt.departmentName());
		System.out.println(tdt.getTodaysWork());
		System.out.println(tdt.getWorkDeadline());
		System.out.println(tdt.getTechStackInformation());
		System.out.println(adt.isTodayAHoliday());		
	}

}
