package steamlike.core.concretes;

import steamlike.core.abstracts.Logger;
import steamlike.dataaccess.abstracts.UserDao;
import steamlike.entities.concretes.User;

public class UserManagerLogger implements Logger {
	private UserDao userDao;
	
	public UserManagerLogger() {
		super();
	}
	
	public UserManagerLogger(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public void add (User user) {
		System.out.println("User " + user.getUserName() + " added to " + userDao);
	}
	
	public void update (User user) {
		System.out.println("User " + user.getUserName() + " updated from " + userDao);
	}
	
	public void delete (User user) {
		System.out.println("User " + user.getUserName() + " deleted from " + userDao);
	}
}
