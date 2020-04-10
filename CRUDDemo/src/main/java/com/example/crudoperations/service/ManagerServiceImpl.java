package com.example.crudoperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.crudoperations.bean.EmployeeBean;
import com.example.crudoperations.bean.ManagerBean;
import com.example.crudoperations.dao.ManagerDAO;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDAO managerDao;

	@Transactional
	public List<ManagerBean> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public EmployeeBean get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void save(ManagerBean manager) {
		managerDao.save(manager);
	}

	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
