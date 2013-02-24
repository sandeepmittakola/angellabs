package co.angellabs.profileservices.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import co.angellabs.profileservices.dao.DefaultUserDAO;
import co.angellabs.springsecurity.core.authority.DefaultUserAuthorityUtils;

/**
 * Integrates with Spring Security using our existing {@link DefaultUserDAO} by looking up a {@link User} and
 * converting it into a {@link UserDetails} so that Spring Security can do the username/password comparison for us.
 *
 * @author vinay
 *
 */
@Component
public class DefaultUserDetailsService implements UserDetailsService {
    private final DefaultUserDAO defaultUserDAO;

    @Autowired
    public DefaultUserDetailsService(DefaultUserDAO defaultUserDAO) {
        if (defaultUserDAO == null) {
            throw new IllegalArgumentException("defaultUserDAO cannot be null");
        }
        this.defaultUserDAO = defaultUserDAO;
    }

    /**
     * Lookup a {@link User} by the username representing the email address. Then, convert the
     * {@link User} into a {@link UserDetails} to conform to the {@link UserDetails} interface.
     */
   
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	co.angellabs.entities.dto.User user = defaultUserDAO.findUserByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username/password.");
        }
        Collection<? extends GrantedAuthority> authorities = DefaultUserAuthorityUtils.createAuthorities(user);
        return new User(user.getEmail(), user.getPassword(), authorities);
    }
}
