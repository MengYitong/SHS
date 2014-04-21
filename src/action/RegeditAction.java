package action;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import domain.Regedit;

public class RegeditAction extends ActionSupport
{
	private Regedit regedit;
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
	public String reg()
	{
		try {
			regedit.saveUser(user);
			setMsg("×¢²á³É¹¦£¡");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			setMsg("×¢²áÊ§°Ü£¡");
		}
		return "regAfter";
	}
}
