package steamlike.bussiness.abstracts;

import steamlike.entities.concretes.User;

public interface UserService {
	public void add (User user);
	public void update (User oldUser, User newUser);
	public void delete (User user);
}
