package co.angellabs.profileservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.angellabs.entities.dto.User;
import co.angellabs.profileservices.dao.DefaultUserDAO;
import co.angellabs.profileservices.service.DefaultService;

/**
 * A default implementation of {@link DefaultService} that delegates to   {@link DefaultUserDAO}.
 *
 * @author VINAY
 *
 */
@Repository
public class DefaultUserServiceImpl implements DefaultService {
   
	private final DefaultUserDAO userDAO;

    @Autowired
    public DefaultUserServiceImpl(DefaultUserDAO userDAO) {
        if (userDAO == null) {
            throw new IllegalArgumentException("userDao cannot be null");
        }
        this.userDAO = userDAO;
    }


    public User getUser(int userid) {
        return userDAO.getUser(userid);
    }

    public User findUserByEmail(String email) {
        return userDAO.findUserByEmail(email);
    }

    public List<User> findUsersByEmail(String partialEmail) {
        return userDAO.findUsersByEmail(partialEmail);
    }

    public int createUser(User user) {
        return userDAO.createUser(user);
    }
}