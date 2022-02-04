package steamlike.dataaccess.concretes;

import java.util.ArrayList;

import steamlike.dataaccess.abstracts.UserDao;
import steamlike.entities.concretes.User;

public class UserMySqlDao implements UserDao {
	ArrayList<User> userList;
	
	public UserMySqlDao() {
		super();
	}

	public UserMySqlDao(ArrayList<User> userList) {
		super();
		this.userList = userList;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		if (!userList.contains(user))
		{
			userList.add(user);
		}
		
	}

	@Override
	public void update(User oldUser, User newUser) {
		// TODO Auto-generated method stub
		int index = userList.indexOf(oldUser);
		userList.set(index, newUser);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MySql Database";
	}
	
}
