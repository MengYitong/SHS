package domain;

import bean.User;

public interface Regedit {
	void saveUser(User user)throws Exception;
	void updateUser(User user)throws Exception;
	void deleteUser(User user)throws Exception;
}
