package com.jiakin.json;

import java.util.Calendar;

import com.alibaba.fastjson.JSON;
/**
 * ��ʾ��һJson������������л��ͷ����л�
 * @author Administrator
 *
 */
public class FastJsonSample1 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpno(9948);
		employee.setEname("������");
		employee.setJob("�䵱����");
		employee.setSalary(10000f);
		employee.setDname("������");
		//����������ʱ��
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 1, 13, 45, 50);
		employee.setHdate(c.getTime());
		//FastJson���ṩ��Json�������Json�������ַ���֮���ת��
		String json = JSON.toJSONString(employee);    //JSON.toJSONString�ǰѶ���ת����Json�ַ���
		System.out.println("employee����ת����Json�ַ�����\r\n"+json);
		Employee emp = JSON.parseObject(json, Employee.class);      //JSON.parseObject()�ǰ�Json�ַ���ת���ɶ���
		System.out.println(emp.toString());
	}
}
