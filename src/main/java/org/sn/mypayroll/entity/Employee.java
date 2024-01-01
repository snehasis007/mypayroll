package org.sn.mypayroll.entity;
import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    protected Integer employeeID;
    @Column(name = "first_name")
    protected String firstName;
    @Column(name = "last_name")
    protected String lastName;
    @Column(name = "email")
    protected String email;
    @Column(name = "phone_number")
    protected String phoneNumber;
    @Column(name = "hire_date")
    protected Timestamp hireDate;
    @Column(name = "commission_pct")
    protected Double commissionPct;
    @Column(name = "job_id")
    protected String jobId;
    @Column(name = "salary")
    protected Double salary;
    @Column(name = "manager_id")
    protected Integer managerId;
    @Column(name = "department_id")
    protected Integer departmentId;

    public Employee() {
    }

    public Employee(Integer employeeID, String firstName, String lastName, String email, String phoneNumber, Timestamp hireDate, Double commissionPct, String jobId, Double salary, Integer managerId, Integer departmentId) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.commissionPct = commissionPct;
        this.jobId = jobId;
        this.salary = salary;
        this.managerId = managerId;
        this.departmentId = departmentId;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public Double getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Double commissionPct) {
        this.commissionPct = commissionPct;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", commissionPct=" + commissionPct +
                ", jobId='" + jobId + '\'' +
                ", salary=" + salary +
                ", managerId=" + managerId +
                ", departmentId=" + departmentId +
                '}';
    }
}
