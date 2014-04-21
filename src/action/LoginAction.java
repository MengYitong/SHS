package action;

import domain.Login;
import bean.User;

public class LoginAction
{
	private Login login;
	private String msg;
	private User user;
	public String getMsg()
	{
		return msg;
	}
	public void setMsg(String msg)
	{
		this.msg=msg;
	}
	public User getUser()
	{
		return user;
	}
	public void setUser(User user)
	{
		this.user=user;
	}
	public String login()
	{
		boolean isSuccess=login.login(user);
		if(isSuccess)
		{
			setMsg("��½�ɹ�");
		}
		else
		{
			setMsg("��½ʧ��");
		}
		return "loginAfter";
	}
}
