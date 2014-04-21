package domain.impl;

import bean.User;
import dao.UserDAO;
import domain.Login;

public class LoginImpl implements Login{
	private UserDAO userDao;
	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return userDao.queryUser(user.getUsername(), user.getPassword())==null?false:true;
	}

}
