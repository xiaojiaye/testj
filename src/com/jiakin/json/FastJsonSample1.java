package com.jiakin.json;

import java.util.Calendar;

import com.alibaba.fastjson.JSON;
/**
 * 演示单一Json对象数组的序列化和反序列话
 * @author Administrator
 *
 */
public class FastJsonSample1 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpno(9948);
		employee.setEname("张三丰");
		employee.setJob("武当掌门");
		employee.setSalary(10000f);
		employee.setDname("政务部门");
		//以下是设置时间
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 1, 13, 45, 50);
		employee.setHdate(c.getTime());
		//FastJson中提供了Json对象，完成Json对象与字符串之间的转换
		String json = JSON.toJSONString(employee);    //JSON.toJSONString是把对象转化成Json字符串
		System.out.println("employee对象转换成Json字符串后：\r\n"+json);
		Employee emp = JSON.parseObject(json, Employee.class);      //JSON.parseObject()是把Json字符串转换成对象
		System.out.println(emp.toString());
	}
}
