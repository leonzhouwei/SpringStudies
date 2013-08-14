package org.sky.ssi.service;

import java.util.List;

import org.sky.ssi.dbo.StudentDBO;
import org.sky.ssi.student.form.StudentForm;

public interface StudentService {
	public List<StudentForm> getAllStudent() throws Exception;
	public void addStudent(String stdName) throws Exception;
	public void delStudent(String[] stdNo) throws Exception;
}
