package com.b6group.assignment;

public class HrDepartment extends SuperDepartment {
	private String deptName;
	private String todayWork;
	private String workDeadline;
	private String doAct;


	public String departmentName() {
		this.deptName = "HR Department";
		return deptName;
	}
	public String getTodaysWork() {
		this.todayWork = "Fill today’s timesheet and mark your attendance";
		return todayWork;
	}
	public String getWorkDeadline() {
		this.workDeadline = "Complete by EOD";
		return workDeadline;
	}

	public String doActivity() {
		this.doAct = "team Lunch";
		return doAct;
	}
	public static void main(String[] args) {

		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());

	}

}
