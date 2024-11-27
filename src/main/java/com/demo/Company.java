package com.demo;

public class Company {
	private String name;
	private int wagePerHr;
	private int fullDayHr;
	private int partTimehrs;
	private int maxWorkDays;
	private int maxWorkHrs;
	public Company(String name, int wagePerHr, int fullDayHr, int partTimehrs, int maxWorkDays, int maxWorkHrs) {
		super();
		this.name = name;
		this.wagePerHr = wagePerHr;
		this.fullDayHr = fullDayHr;
		this.partTimehrs = partTimehrs;
		this.maxWorkDays = maxWorkDays;
		this.maxWorkHrs = maxWorkHrs;
	}
	public String getName() {
		return name;
	}
	public int getWagePerHr() {
		return wagePerHr;
	}
	public int getFullDayHr() {
		return fullDayHr;
	}
	public int getPartTimehrs() {
		return partTimehrs;
	}
	public int getMaxWorkDays() {
		return maxWorkDays;
	}
	public int getMaxWorkHrs() {
		return maxWorkHrs;
	}
}
