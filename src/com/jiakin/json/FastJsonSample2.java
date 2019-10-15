package com.jiakin.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * ��ʾJson������������л��ͷ����л�
 * @author Administrator
 *
 */
public class FastJsonSample2 {

	public static void main(String[] args) {
		//��ʼ��100��Ա������add��List��	
		List emplist = new ArrayList();
		for(int i=1;i<=100;i++) {
			Employee emp = new Employee();
			emp.setEmpno(9948 + i);
			emp.setEname("Ա��" + i);
			emplist.add(emp);
		}
		String listJson = JSON.toJSONString(emplist);   //JSON.toJSONString()�������ڽ�Json����ת�����ַ��������Դ���һ����Ҳ���Դ�list����
		System.out.println(listJson);
		List<Employee> emps= JSON.parseArray(listJson, Employee.class) ;  //JSON.parseArray(listJson, Employee.class)���������ڽ�JSON�����ַ���ת����List<T>����T�Ǿ����ʵ����
		for(Employee e:emps) {
			System.out.println(e.getEmpno() + " : " + e.getEname());
		}

	}

}
