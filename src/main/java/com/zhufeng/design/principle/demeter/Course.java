package com.zhufeng.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Course {
	public void commandCheckNumber(TeamLeader teamLeader) {
		List<Course> courseList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			courseList.add(new Course());
		}

		teamLeader.checkNumberOfCourses(courseList);
	}
}
