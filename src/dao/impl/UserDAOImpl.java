package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.User;
import dao.UserDAO;

public class UserDAOImpl implements UserDAO{
	private SessionFactory sessionFactory;
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public User queryUser(String name, String password) {
		// TODO Auto-generated method stub
		List<User> users=getSession().createQuery("from User u where u.username=? and u.password=?").setParameter(0, name).setParameter(1, password).list();
		if(users.size()!=0)
		{
			return users.get(0);
		}
		return null;
	}

	@Override
	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		try{
		getSession().save(user);
		}
		catch(Exception e){
			e.printStackTrace();
			throw new Exception("≤Â»Î ß∞‹£°");
		}
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		getSession().update(user);
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		this.getSession().delete(user);
	}

}
