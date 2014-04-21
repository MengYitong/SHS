package domain.impl;

import bean.User;
import dao.UserDAO;
import domain.Regedit;

public class RegeditImpl implements Regedit{
	private UserDAO userDao;
	@Override
	public void saveUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userDao.insertUser(user);
	}

	@Override
	public void updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	@Override
	public void deleteUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userDao.deleteUser(user);
		
	}

}
