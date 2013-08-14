package org.sky.ssh1.alpha.dao;

import org.sky.ssh1.alpha.dbo.StudentDBO;
import org.sky.ssh1.alpha.student.form.*;
import java.util.*;

public interface StudentDAO {

	public List<StudentDBO> getAllStudent() throws Exception;

	public void addStudent(String stdName) throws Exception;

	public void delStudent(String stdNo) throws Exception;
}
