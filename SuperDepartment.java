package com.b6group.assignment;

public class SuperDepartment {
	private String deptName;
	private String todayWork;
	private String workDeadline;
	public String isHoliday;
	
    public String departmentName() {
		this.deptName = "Super Department";
		return deptName;
	}
	public String getTodaysWork() {
		this.todayWork = "No Work as of now";
		return todayWork;
	}
	public String getWorkDeadline() {
		this.workDeadline = "Nil";
		return workDeadline;
	}
	public String isTodayAHoliday() {
		this.isHoliday = "Today is not a holiday";
		return isHoliday;
	}
}
