package hpn.service;

import hpn.model.User;

import java.util.List;

public interface IUserService {
    User adminlogin(String username, String password);

    List<User> getUser();

    User getUserByID(int id);
}
