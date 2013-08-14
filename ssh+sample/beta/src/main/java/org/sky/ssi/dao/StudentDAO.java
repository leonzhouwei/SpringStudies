package org.sky.ssi.dao;

import org.sky.ssi.dbo.StudentDBO;
import org.sky.ssi.student.form.*;
import java.util.*;

public interface StudentDAO {

	public List<StudentDBO> getAllStudent() throws Exception;

	public void addStudent(Map<String, Object> paraMap) throws Exception;

	public void delStudent(Map<String, Object> paraMap) throws Exception;
}
