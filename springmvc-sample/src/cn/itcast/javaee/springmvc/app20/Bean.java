package cn.itcast.javaee.springmvc.app20;

/**
 * 封装User和Admin的对象
 * @author AdminTC
 */
public class Bean {
	private User user;
	private Admin admin;
	public Bean(){}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}
