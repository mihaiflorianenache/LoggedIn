package Service;

import Domain.Users;
import Persistence.UsersRepository;

import java.sql.SQLException;
import java.util.List;

public class UsersService {

    private UsersRepository usersRepository=new UsersRepository();

    public void insertUser(Users users) throws SQLException {
        usersRepository.insertUser(users);
    }

    public List<Users> getUsers() throws SQLException {
        return usersRepository.getUser();
    }
}
