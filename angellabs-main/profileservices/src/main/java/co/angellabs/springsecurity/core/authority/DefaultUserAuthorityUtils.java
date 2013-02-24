package co.angellabs.springsecurity.core.authority;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import co.angellabs.entities.dto.User;


/**
 * A utility class used for creating the {@link GrantedAuthority}'s given a {@link CalendarUser}. In a real solution
 * this would be looked up in the existing system, but for simplicity our original system had no notion of authorities.
 *
 * @author Rob Winch
 *
 */
public final class DefaultUserAuthorityUtils {
    private static final List<GrantedAuthority> ADMIN_ROLES = AuthorityUtils.createAuthorityList("ROLE_ADMIN",
            "ROLE_USER");
    private static final List<GrantedAuthority> USER_ROLES = AuthorityUtils.createAuthorityList("ROLE_USER");

    public static Collection<? extends GrantedAuthority> createAuthorities(User user) {
        String username = user.getEmail();
        if (username.startsWith("admin")) {
            return ADMIN_ROLES;
        }
        return USER_ROLES;
    }

    private DefaultUserAuthorityUtils() {
    }
}
