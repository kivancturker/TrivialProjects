package ecommerce.bussiness.concretes;

import ecommerce.bussiness.abstracts.UserService;
import ecommerce.bussiness.exceptions.BusinessException;
import ecommerce.dataaccess.abstracts.UserDao;
import ecommerce.entity.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;

	public UserManager() {
		super();
	}

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void register(User user) throws BusinessException {
		// TODO Auto-generated method stub
		if (isValidPassword(user.getPassword()) && isValidEmail(user.getEmail()))
		{
			userDao.register(user);
			System.out.println("User Successfully registered.");
		}
		else if (!isValidPassword(user.getPassword()))
		{
			throw new BusinessException("Invalid Password.");
		}
		else if (!isValidEmail(user.getEmail()))
		{
			throw new BusinessException("Invalid Email.");
		}
	}

	@Override
	public void update(User user) throws BusinessException {
		// TODO Auto-generated method stub
		if (isValidPassword(user.getPassword()) && isValidEmail(user.getEmail()))
		{
			userDao.update(user);
			System.out.println("User Successfully updated.");
		}
		else if (!isValidPassword(user.getPassword()))
		{
			throw new BusinessException("Invalid Password.");
		}
		else if (!isValidEmail(user.getEmail()))
		{
			throw new BusinessException("Invalid Email.");
		}
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
		System.out.println("User Successfully deleted.");
	}
	
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		if (userDao.isUserExist(user))
		{
			System.out.print("User Logged in");
		}
		else
		{
			System.out.print("Login Failed");
		}
	}

	private boolean isValidPassword (String password) {
		return password.length() >= 6; // Returns true if contains at least 6 characters.
	}
	
	private boolean isValidEmail (String email) {
		return email.contains("@");
	}
	
	
}
