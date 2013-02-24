package co.angellabs.profileservices.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Transactional;

import co.angellabs.entities.dto.User;
import co.angellabs.profileservices.dao.DefaultUserDAO;

public class DefaultUserDAOImpl implements DefaultUserDAO {


    private final JdbcOperations jdbcOperations;

    // --- constructors ---

    @Autowired
    public DefaultUserDAOImpl(JdbcOperations jdbcOperations) {
        if (jdbcOperations == null) {
            throw new IllegalArgumentException("jdbcOperations cannot be null");
        }
        this.jdbcOperations = jdbcOperations;
    }

    // --- DefaultUserDAO methods ---

    @Transactional(readOnly = true)
    public User getUser(int userid) {
    	
    	
        User user=jdbcOperations.queryForObject(USER_QUERY + "user_id = ?", USER_MAPPER, userid);
        
        System.out.println("inside dao layer"+user.getName());
        
        return user;
    }

    @Transactional(readOnly = true)
    public User findUserByEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email cannot be null");
        }
        try {
            return jdbcOperations.queryForObject(USER_QUERY + "email = ?", USER_MAPPER, email);
        } catch (EmptyResultDataAccessException notFound) {
            return null;
        }
    }

    @Transactional(readOnly = true)
    public List<User> findUsersByEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email cannot be null");
        }
        if ("".equals(email)) {
            throw new IllegalArgumentException("email cannot be empty string");
        }
        return jdbcOperations.query(USER_QUERY + "email like ? order by id", USER_MAPPER, email + "%");
    }

    public int createUser(final User userToAdd) {
        if (userToAdd == null) {
            throw new IllegalArgumentException("userToAdd cannot be null");
        }
        if (userToAdd.getUserId()!= 0) {
            throw new IllegalArgumentException("userToAdd.getUserId() must be null when creating a "+User.class.getName());
        }
        KeyHolder keyHolder = new GeneratedKeyHolder();
        this.jdbcOperations.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(
                        "insert into users (email, password, username) values (?, ?, ?)",
                        new String[] { "user_id" });
                ps.setString(1, userToAdd.getEmail());
                ps.setString(2, userToAdd.getPassword());
                ps.setString(3, userToAdd.getName());
                return ps;
            }
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }

    // --- non-public static members ---

    private static final String USER_QUERY = "select user_id, email, password,username from users where ";

    private static final RowMapper<User> USER_MAPPER = new UserRowMapper("users.");

    /**
     * Create a new RowMapper that resolves {@link CalendarUser}'s given a column label prefix. By allowing the prefix
     * to be specified we can reuse the same {@link RowMapper} for joins in other tables.
     *
     * @author Rob Winch
     *
     */
    static class UserRowMapper implements RowMapper<User> {
        private final String columnLabelPrefix;

        /**
         * Creates a new instance that allows for a custom prefix for the columnLabel.
         *
         * @param columnLabelPrefix
         */
        public UserRowMapper(String columnLabelPrefix) {
            this.columnLabelPrefix = columnLabelPrefix;
        }

        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setUserId(rs.getInt(columnLabelPrefix + "user_id"));
            user.setEmail(rs.getString(columnLabelPrefix + "email"));
            user.setPassword(rs.getString(columnLabelPrefix + "password"));
            user.setName(rs.getString(columnLabelPrefix + "username"));
            return user;
        }
    };

}
