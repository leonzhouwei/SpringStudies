package org.sky.ssh.dao;

import org.sky.ssh.model.TStudent;
import org.sky.ssh.dbo.StudentDBO;
import java.util.*;

public interface StudentDAO {

	public List<TStudent> getAllStudent() throws Exception;

	public void addStudent(String studentName) throws Exception;

	public void delStudent(TStudent std) throws Exception;
}
