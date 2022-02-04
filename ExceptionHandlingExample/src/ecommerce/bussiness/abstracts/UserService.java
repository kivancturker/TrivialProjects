package ecommerce.bussiness.abstracts;

import ecommerce.bussiness.exceptions.BusinessException;
import ecommerce.entity.concretes.User;

public interface UserService {
	public void register(User user) throws BusinessException;
	public void update(User user) throws BusinessException;
	public void delete(User user);
	public void login(User user);
}
