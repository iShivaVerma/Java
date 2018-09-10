package com.infogain.mapdemo;

public class Job {

	private String title;
	private long minSalary;
	private long maxSalary;
	
	public Job() {
		super();
	}

	public Job(String title, long minSalary, long maxSalary) {
		super();
		this.title = title;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(long minSalary) {
		this.minSalary = minSalary;
	}

	public long getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(long maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return "Job [title=" + title + ", minSalary=" + minSalary + ", maxSalary=" + maxSalary + "]";
	}
}
