package com.b6group.assignment;

public class AdminDepartment extends SuperDepartment {
	private String deptName;
	private String todayWork;
	private String workDeadline;
	public String departmentName() {
		this.deptName = "Admin Department";
		return deptName;
	}
	public String getTodaysWork() {
		this.todayWork = "Complete your documents Submission";
		return todayWork;
	}
	public String getWorkDeadline() {
		this.workDeadline = "Complete by EOD";
		return workDeadline;
	}
	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());

	}
}
