package org.sky.ssh.service;

import java.util.List;

import org.sky.ssh.dbo.StudentDBO;
import org.sky.ssh.student.form.StudentForm;

public interface StudentService {
	public List<StudentForm> getAllStudent() throws Exception;

	public void addStudent(String stdName) throws Exception;

	public void delStudent(String[] stdNo) throws Exception;
}
