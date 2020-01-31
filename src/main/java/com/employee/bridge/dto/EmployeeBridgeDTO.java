package com.employee.bridge.dto;
/**
 * class of employee dto
 * @author abdul.rahimanshaik
 *
 */
public class EmployeeBridgeDTO {
	private Long employeeID;
	private String employeeName;
	private String employeePracticeArea;
	private String employeeDesignation;
	private String employeeCompanyInfo;
	public Long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePracticeArea() {
		return employeePracticeArea;
	}
	public void setEmployeePracticeArea(String employeePracticeArea) {
		this.employeePracticeArea = employeePracticeArea;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getEmployeeCompanyInfo() {
		return employeeCompanyInfo;
	}
	public void setEmployeeCompanyInfo(String employeeCompanyInfo) {
		this.employeeCompanyInfo = employeeCompanyInfo;
	}
	@Override
	public String toString() {
		return "EmployeeBridgeDTO [employeeID=" + employeeID + ", employeeName=" + employeeName
				+ ", employeePracticeArea=" + employeePracticeArea + ", employeeDesignation=" + employeeDesignation
				+ ", employeeCompanyInfo=" + employeeCompanyInfo + "]";
	}
	
}
