package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.entities.User;
import kg.natvprod.natv_prod.entities.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);
    List<User> findAll();
}
