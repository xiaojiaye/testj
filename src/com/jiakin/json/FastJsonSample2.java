package com.jiakin.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * 演示Json对象数组的序列化和反序列话
 * @author Administrator
 *
 */
public class FastJsonSample2 {

	public static void main(String[] args) {
		//初始化100个员工，并add到List中	
		List emplist = new ArrayList();
		for(int i=1;i<=100;i++) {
			Employee emp = new Employee();
			emp.setEmpno(9948 + i);
			emp.setEname("员工" + i);
			emplist.add(emp);
		}
		String listJson = JSON.toJSONString(emplist);   //JSON.toJSONString()方法用于将Json对象转化成字符串，可以传单一对象，也可以传list对象。
		System.out.println(listJson);
		List<Employee> emps= JSON.parseArray(listJson, Employee.class) ;  //JSON.parseArray(listJson, Employee.class)方法，用于将JSON数组字符串转换成List<T>对象，T是具体的实体类
		for(Employee e:emps) {
			System.out.println(e.getEmpno() + " : " + e.getEname());
		}

	}

}
