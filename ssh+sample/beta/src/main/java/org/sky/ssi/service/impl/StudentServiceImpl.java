package org.sky.ssi.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sky.ssi.dao.LoginDAO;
import org.sky.ssi.dao.StudentDAO;
import org.sky.ssi.dbo.StudentDBO;
import org.sky.ssi.service.StudentService;
import org.sky.ssi.student.form.StudentForm;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	private Log logger = LogFactory.getLog(this.getClass());
	@Resource
	private StudentDAO studentDAO;

	@Override
	public List<StudentForm> getAllStudent() throws Exception {
		List<StudentDBO> stdList = new ArrayList<StudentDBO>();
		List<StudentForm> rtnList = new ArrayList<StudentForm>();
		stdList = studentDAO.getAllStudent();
		for (StudentDBO dbo : stdList) {
			StudentForm stdForm = new StudentForm();
			BeanUtils.copyProperties(stdForm, dbo);
			rtnList.add(stdForm);
		}
		return rtnList;
	}

	public void addStudent(String stdName) throws Exception {
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("stdName", stdName);
		studentDAO.addStudent(paraMap);
	}

	public void delStudent(String[] stdNo) throws Exception {
		for (String s : stdNo) {
			Map<String, Object> paraMap = new HashMap<String, Object>();
			paraMap.put("stdNo", s);
			studentDAO.delStudent(paraMap);
//			throw new Exception("force system to throw a exception");
		}
	}
}
