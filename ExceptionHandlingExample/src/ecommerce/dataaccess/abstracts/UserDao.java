package ecommerce.dataaccess.abstracts;

import java.util.ArrayList;

import ecommerce.entity.concretes.User;

public interface UserDao {
	public void register(User user);
	public void update(User user);
	public void delete(User user);
	public boolean isUserExist(User user);
	public ArrayList<User> getAll();
}
