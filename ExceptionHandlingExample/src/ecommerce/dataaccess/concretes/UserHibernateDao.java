package ecommerce.dataaccess.concretes;

import java.util.ArrayList;

import ecommerce.dataaccess.abstracts.UserDao;
import ecommerce.dataaccess.exceptions.NoUserFoundException;
import ecommerce.entity.concretes.User;

public class UserHibernateDao implements UserDao {
	private ArrayList<User> userList;

	public UserHibernateDao() {
		super();
		userList = new ArrayList<User>();
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userList.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		try 
		{
			userList.set(getIndexOfUser(user), user);
		}
		catch (NoUserFoundException exc)
		{
			exc.printStackTrace();
		}
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userList.remove(user);
		
	}

	@Override
	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return userList.contains(user);
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return userList;
	}
	
	private int getIndexOfUser(User user) throws NoUserFoundException {
		for (User curr : userList)
		{
			if (curr.getId() == user.getId())
			{
				return userList.indexOf(curr);
			}
		}
		throw new NoUserFoundException("User Not Found.");
	}
}
