package com.jiakin.json;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Employee {
	private Integer empno;
	private String ename;
	private String job;
	@JSONField(name="hiredate", format="yyyy-MM-dd HH:mm:ss SSS")   //ע����治�ӷֺ�, name����ָ��Json��key�ļ���
	private Date hdate;
	private Float salary;
	
	public Employee() {
	System.out.println("Employee() 构造方法执行了");
	}
	
	public Employee(Integer empno, String ename, String job, Date hdate, Float salary, String dname) {	
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hdate = hdate;
		this.salary = salary;
		this.dname = dname;
	}
	
	@JSONField(serialize = false)  //��ʾ����dname������ԣ������л������Json�ַ�����
	private String dname;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHdate() {
		return hdate;
	}
	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		
		return this.getEmpno()+"   ," + this.getEname() +"   ," + this.getJob()+"   ,"  + this.getSalary()+"   ,"  + this.getHdate()+"   ,"  + this.getDname();
	}

	

}
