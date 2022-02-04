package steamlike.bussiness.concretes;

import steamlike.bussiness.abstracts.UserService;
import steamlike.core.concretes.UserManagerLogger;
import steamlike.dataaccess.abstracts.UserDao;
import steamlike.entities.concretes.User;

public class UserManager implements UserService {
	UserDao userDao;
	UserManagerLogger logger;
	
	public UserManager() {
		super();
	}

	public UserManager(UserDao userDao, UserManagerLogger logger) {
		super();
		this.userDao = userDao;
		this.logger = logger;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
		logger.add(user);
	}

	@Override
	public void update(User oldUser, User newUser) {
		// TODO Auto-generated method stub
		userDao.update(oldUser, newUser);
		logger.update(oldUser);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
		logger.delete(user);
	}
	
}
