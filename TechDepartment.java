package com.b6group.assignment;

public class TechDepartment extends SuperDepartment {
	private String deptName;
	private String todayWork;
	private String workDeadline;
	private String stackInfo;

	
    public String departmentName() {
		this.deptName = "Tech Department";
		return deptName;
	}
	public String getTodaysWork() {
		this.todayWork = "Complete coding of module 1";
		return todayWork;
	}
	public String getWorkDeadline() {
		this.workDeadline = "Complete by EOD";
		return workDeadline;
	}
	
	public String getTechStackInformation() {
		this.stackInfo = "core Java";
		return stackInfo;
	}
      public static void main(String[] args) {
		
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	
	}

}
