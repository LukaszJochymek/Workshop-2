package pl.coderslab.entity;

import pl.coderslab.entity.User;

public class UserDao {

    private static final String CREATE_USER_QUERY =

            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    private static final String READ_USER_QUERY = "SELECT * FROM users";
    private static final String UPDATE_USER_QUERY = "UPDATE users SET id='value1', email='value2', username='value3, password='value4";
    private static final String DELETE_USER_QUERY = "";

    public User[] findAll(){
        return null;
    }
    public User findById(Long id){
        return null;
    }
    public User create(User user){
        return null;
    }
    public User update(User user){
        return null;
    }
    public boolean delete(User user){
        return false;
    }


}
