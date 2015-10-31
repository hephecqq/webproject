package com.hephec.dao;

import org.junit.Test;
import java.util.List;
public class CourseDap {

	@Test
	public void test() {
		CourseDao cDao=new CourseDao();
		List list=cDao.getAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
