package com.aurionpro.model;

public class Student {
	private IStudentService studentService;
	
	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}

	double calculatePercentage() {
		return studentService.getTotalMarks() / studentService.getTotalSubjects();
		
	}
}
