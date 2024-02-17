package com.gl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.dao.LoginDao;
import com.gl.model.Login;

@Service
public class LoginService {
	
	@Autowired
	LoginDao loginDao;
	
	public boolean validateLoginSvc(Login login)
	{
		return loginDao.validateLogin(login);
	}

}
