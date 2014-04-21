package dao;

import bean.User;

public interface UserDAO {
	User queryUser(String name,String password);
	void insertUser(User user) throws Exception;
	void updateUser(User user);
	void deleteUser(User user);
}
