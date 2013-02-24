package co.angellabs.profileservices.dao;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import co.angellabs.entities.dto.User;

/**
 * An interface for managing {@link User} instances.
 *
 * @author vinay
 *
 */
public interface DefaultUserDAO {

    /**
     * Gets a {@link User} for a specific {@link User#getUserId()}.
     *
     * @param userid
     *            the {@link User#getUserId()} of the {@link User} to find.
     * @return a {@link User} for the given userid. Cannot be null.
     * @throws EmptyResultDataAccessException
     *             if the {@link User} cannot be found
     */
    User getUser(int userid);

    /**
     * Finds a given {@link User} by email address.
     *
     * @param email
     *            the email address to use to find a {@link User}. Cannot be null.
     * @return a {@link User} for the given email or null if one could not be found.
     * @throws IllegalArgumentException
     *             if email is null.
     */
    User findUserByEmail(String email);


    /**
     * Finds any {@link User} that has an email that starts with {@code partialEmail}.
     *
     * @param partialEmail
     *            the email address to use to find {@link User}s. Cannot be null or empty String.
     * @return a List of {@link User}s that have an email that starts with given partialEmail. The returned value
     *         will never be null. If no results are found an empty List will be returned.
     * @throws IllegalArgumentException
     *             if email is null or empty String.
     */
    List<User> findUsersByEmail(String partialEmail);

    /**
     * Creates a new {@link User}.
     *
     * @param user
     *            the new {@link User} to create. The {@link User#getId()} must be null.
     * @return the new {@link User#getId()}.
     * @throws IllegalArgumentException
     *             if {@link User#getId()} is non-null.
     */
    int createUser(User user);
}
