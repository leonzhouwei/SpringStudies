package org.sky.ssh.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sky.ssh.dao.LoginDAO;
import org.sky.ssh.dao.StudentDAO;
import org.sky.ssh.dbo.StudentDBO;
import org.sky.ssh.model.TStudent;
import org.sky.ssh.service.StudentService;
import org.sky.ssh.vo.StudentVO;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	private Log logger = LogFactory.getLog(this.getClass());
	@Resource
	private StudentDAO studentDAO;

	@Override
	public List<StudentVO> getAllStudent() throws Exception {
		List<TStudent> stdList = new ArrayList<TStudent>();
		List<StudentVO> rtnList = new ArrayList<StudentVO>();
		stdList = studentDAO.getAllStudent();
		for (TStudent dbo : stdList) {
			StudentVO std = new StudentVO();
			BeanUtils.copyProperties(std, dbo);
			rtnList.add(std);
		}
		return rtnList;
	}

	public void addStudent(String stdName) throws Exception {
		studentDAO.addStudent(stdName);
	}

	public void delStudent(String[] stdNo) throws Exception {
		for (String s : stdNo) {
			TStudent std = new TStudent();
			std.setStudentNo(Long.parseLong(s));
			studentDAO.delStudent(std);
			// throw new Exception("force system to throw a exception");
		}
	}
}
